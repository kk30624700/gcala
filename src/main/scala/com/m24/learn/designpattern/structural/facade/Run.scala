package com.m24.learn.designpattern.structural.facade

object Run extends App {
    val computer = new ComputerFacade()
    computer.powerOn()
}
