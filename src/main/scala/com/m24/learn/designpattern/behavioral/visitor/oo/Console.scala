package com.m24.learn.designpattern.behavioral.visitor.oo

object Console extends App {
    val zoo = new Zoo(new Monkey, new Lion, new Dolphin)
    zoo.accept(new Speak)
    zoo.accept(new Swim)
}
