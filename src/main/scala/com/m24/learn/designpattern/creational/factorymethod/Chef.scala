package com.m24.learn.designpattern.creational.factorymethod

trait Chef {
    def makeNoodle(): Noodle

    def cook(): Unit = {
        val noodle = makeNoodle()
        println(s"the noodle is ${noodle.flavor()}")
    }
}

class ThaiChef extends Chef {
    override def makeNoodle(): Noodle = new PadThai()
}

class ItalianChef extends Chef {
    override def makeNoodle(): Noodle = new Spaghetti()
}
