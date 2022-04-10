package com.m24.learn.designpattern.creational.cake

object Run extends App {

    val audi = new Car with AudiCarComponentRegistry
    audi.drive()

    val bmw = new Car with BMWCarComponentRegistry
    bmw.drive()
}
