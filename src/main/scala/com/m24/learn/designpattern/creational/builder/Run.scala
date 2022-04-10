package com.m24.learn.designpattern.creational.builder

object Run extends App {
    val car = new DIYCarBuilder().setEngine("V6").setWheels(4).setColor("Red").build()
    println(car)
}
