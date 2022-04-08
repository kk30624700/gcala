package com.m24.learn.akka.sparkmasterworker.master

import akka.actor.{Actor, ActorSystem, Props}
import com.m24.learn.akka.sparkmasterworker.common.{HeartBeat, RegisterWorkerInfo, RemoveTimeOutWorker, StartTimeOutWorker, WorkerInfo}
import com.typesafe.config.ConfigFactory

import scala.collection.mutable
import scala.concurrent.duration.DurationInt

class SparkMaster extends Actor {
    val workers = mutable.Map[String, WorkerInfo]()
    override def receive: Receive = {
        case "start" => {
          println("master 服务器启动了")
          self ! StartTimeOutWorker
        }
        case RegisterWorkerInfo(id, cpu, ram) => {
            if (!workers.contains(id)) {
                val workerInfo = new WorkerInfo(id, cpu, ram)
                workers += ((id, workerInfo))
                println(s"服务器的workders=$workers")
                sender ! RegisterWorkerInfo
            }
        }
        case HeartBeat(id) => {
          val workerInfo = workers(id)
          workerInfo.lastHearBeat = System.currentTimeMillis()
          println(s"master更新 $id 心跳时间")
        }
        case StartTimeOutWorker => {
          println(s"开始定时检测worker心跳任务")
          import context.dispatcher
          context.system.scheduler.schedule(0 millis, 9000 millis, self, RemoveTimeOutWorker)
        }
        case RemoveTimeOutWorker => {
          val workerInfos = workers.values
          val nowTime = System.currentTimeMillis()
          workerInfos.filter(workerInfo => (nowTime-workerInfo.lastHearBeat > 6000))
            .foreach(workerInfo => workers.remove(workerInfo.id))
          println(s"当前有 ${workers.size} 个worker存活")
        }
    }
}

object SparkMaster {
    def main(args: Array[String]): Unit = {

        if (args.length != 3) {
            println("输入参数 host port sparkMsterActor名字")
            sys.exit()
        }

        val host = args(0)
        val port = args(1)
        val name = args(2)

        val config = ConfigFactory.parseString {
            s"""
               |akka.actor.provider="akka.remote.RemoteActorRefProvider"
               |akka.remote.netty.tcp.hostname=${host}
               |akka.remote.netty.tcp.port=${port}
             """.stripMargin
        }

        val sparkMasterSystem = ActorSystem("SparkMaster", config)
        val sparkMasterRef = sparkMasterSystem.actorOf(Props[SparkMaster], name)

        sparkMasterRef ! "start"
    }
}