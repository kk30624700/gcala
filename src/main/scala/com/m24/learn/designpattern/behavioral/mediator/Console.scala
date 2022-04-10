package com.m24.learn.designpattern.behavioral.mediator

object Console extends App {
  val china = new China
  val usa = new USA
  val canada = new Canada

  val united = new UniteNations
  united.addMember(china)
  united.addMember(usa)
  united.addMember(canada)

  usa.declare("Hello World")
}
