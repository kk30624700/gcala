package com.m24.learn.designpattern.creational.valueobject

object Run extends App {
    val point1 = Point(1, 2)
    val point2 = Point(1, 2)
    println(point1)
    println(point1 == point2)
}
