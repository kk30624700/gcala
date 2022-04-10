package com.m24.learn.designpattern.creational.abstractfactory

object Run extends App {
    val audi = new Car(AudiCarFactory)
    audi.drive()

    val bmw = new Car(BMWCarFactory)
    bmw.drive()
}
