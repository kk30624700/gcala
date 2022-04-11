package com.m24.learn.designpattern.structural.typeclasses

object Run extends App {
    val human = new Human()
    val monkey = new Monkey()
    val lion = new Lion()
    println(human.sayHelloTo(monkey))
    println(human.sayHelloTo(lion))
    val x = List(1,2,3)
}
