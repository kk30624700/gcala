package com.m24.learn.designpattern.behavioral.command.oo

class Television {
    var channel: Int = 0
    var volume: Int = 0

    def show(): Unit = {
        println(s"tv channel = ${channel}, volumn = ${volume}")
    }
}
