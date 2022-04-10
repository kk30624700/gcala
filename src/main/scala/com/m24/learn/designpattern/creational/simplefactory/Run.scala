package com.m24.learn.designpattern.creational.simplefactory

object Run extends App {
    val op = Operation("*")
    val result = op.getResult(1, 2)
    println(result)
}
