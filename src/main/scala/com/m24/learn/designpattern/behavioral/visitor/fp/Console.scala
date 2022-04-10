package com.m24.learn.designpattern.behavioral.visitor.fp

object Console extends App {
    val zoo = new Zoo(new Monkey, new Lion, new Dolphin)
    zoo.accept(AnimalOperation.speak)
    zoo.accept(AnimalOperation.swim)
}
