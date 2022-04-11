package com.m24.learn.designpattern.structural.facade

class CPU {
    def powerOn(): Unit = {
        println("CPU is powered on.")
    }
}

class Fan {
    def run(): Unit ={
        println("Fan is running")
    }
}

class Light {
    def flash(): Unit = {
        println("Light is flashing")
    }
}
