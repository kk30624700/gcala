package com.m24.learn.akka.sparkmasterworker.common

case class RegisterWorkerInfo(id: String, cpu: Int, ram: Int)

class WorkerInfo(val id: String, val cpu: Int, val ram: Int) {
  var lastHearBeat: Long = System.currentTimeMillis()
}

case object RegisterWorkerInfo

case object SendHearBeat

case class HeartBeat(id: String)

case object StartTimeOutWorker

case object RemoveTimeOutWorker

