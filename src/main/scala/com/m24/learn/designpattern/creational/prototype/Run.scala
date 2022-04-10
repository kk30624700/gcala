package com.m24.learn.designpattern.creational.prototype

object Run extends App {
    val v = new Virus("HIV", "BAD")
    println(v == v.clone())

    val b = Bacteria("LAB", "GOOD")
    println(b == b.copy())
}
