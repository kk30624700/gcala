package com.m24.learn.designpattern.structural.magnet

object Run extends App {
    val doubling = new Doubling()
    println(doubling.double(2))
    println(doubling.double(List(1, 2, 3)))
    println(doubling.double(List("a", "b", "c")))
    println(doubling.double("a", 5))
}
