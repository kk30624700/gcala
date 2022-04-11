package com.m24.learn.designpattern.structural.flyweight

object Run extends App {
    val teaShop = new TeaShop()

    teaShop.takeOrder(1, Tea.GreenTea)
    teaShop.takeOrder(2, Tea.GreenTea)
    teaShop.takeOrder(3, Tea.UnsharedTea)
    teaShop.takeOrder(4, Tea.UnsharedTea)

    teaShop.serve()
}
