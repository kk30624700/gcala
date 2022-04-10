package com.m24.learn.designpattern.behavioral.templatemethod

object Console extends App {
    val vegan = new Vegan
    vegan.goToRestaurant()

    val meatLover = new MeatLover
    meatLover.goToRestaurant()
}
