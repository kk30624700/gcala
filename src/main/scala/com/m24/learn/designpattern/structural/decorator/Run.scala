package com.m24.learn.designpattern.structural.decorator

object Run extends App {
    val coffee = new SimpleCoffee with MilkAdded with SugarAdded
    println(coffee.getCost)
    println(coffee.getDescription)
}
