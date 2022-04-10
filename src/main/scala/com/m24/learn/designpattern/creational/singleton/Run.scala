package com.m24.learn.designpattern.creational.singleton

object Run extends App {
    val s1 = Singleton
    val s2 = Singleton

    println(s1 == s2)
}
