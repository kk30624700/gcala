package com.m24.learn.akka

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

class SysHelloActor extends Actor {
    override def receive: Receive = {
        case "hello" => println("hi !")
        case "ok" => println("all right")
        case "exit" => {
            println("EXIT...")
            context.stop(self)
            context.system.terminate
        }
        case _ => println("???")
    }
}

object SysHelloActor {
    def start(): Unit = {
        val actoryFactory = ActorSystem("actoryFactory")
        val sayHelloActoryRef: ActorRef = actoryFactory.actorOf(Props[SysHelloActor], "sayHelloActor")
        sayHelloActoryRef ! "hello"
        sayHelloActoryRef ! "ok"
        sayHelloActoryRef ! "ok~"
        sayHelloActoryRef ! "exit"
    }
}

object AkkaDemo {
    def main(args: Array[String]): Unit = {
        SysHelloActor.start()
    }
}
