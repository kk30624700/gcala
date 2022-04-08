package com.m24.learn.akka.sparkmasterworker.worker

import akka.actor.{Actor, ActorSelection, ActorSystem, Props}
import com.m24.learn.akka.sparkmasterworker.common.{HeartBeat, RegisterWorkerInfo, SendHearBeat}
import com.typesafe.config.ConfigFactory

import scala.concurrent.duration.DurationInt

class SparkWorker(masterHost: String, masterPort: Int, masterName: String) extends Actor {
    var masterPorxy: ActorSelection = _

    val id = java.util.UUID.randomUUID().toString

    override def preStart(): Unit = {
        masterPorxy = context.actorSelection(s"akka.tcp://SparkMaster@${masterHost}:${masterPort}/user/${masterName}")
        println("masterProxy="+masterPorxy)
    }

    override def receive: Receive = {
        case "start" => {
            println("worker 启动了")
            masterPorxy ! RegisterWorkerInfo(id, 16, 16*1024)
        }
        case RegisterWorkerInfo => {
            println(s"workerid=${id} 注册成功")
            import context.dispatcher
            context.system.scheduler.schedule(0 millis, 3000 millis, self, SendHearBeat)
        }
        case SendHearBeat => {
            println(s"workd=${id}给master发送心跳")
            masterPorxy ! HeartBeat(id)
        }
    }
}


object SparkWorker {
    def main(args: Array[String]): Unit = {
        if (args.length != 6) {
            println("输入 workerHost workerPort workerName masterHost masterPort masterName")
            sys.exit()
        }

        val workerHost = args(0)
        val workerPort = args(1)
        val workerName = args(2)
        val masterHost = args(3)
        val masterPort = args(4)
        val masterName = args(5)

        val config = ConfigFactory.parseString {
            s"""
               |akka.actor.provider="akka.remote.RemoteActorRefProvider"
               |akka.remote.netty.tcp.hostname=${workerHost}
               |akka.remote.netty.tcp.port=${workerPort}
             """.stripMargin
        }

        val sparkWorkSystem = ActorSystem("SparkWorker", config)
        val sparkWorkerRef = sparkWorkSystem.actorOf(Props(new SparkWorker(masterHost, masterPort.toInt, masterName)), workerName)

        sparkWorkerRef ! "start"
    }
}