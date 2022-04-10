package com.m24.learn.designpattern.creational.factorymethod

trait Noodle {
    def flavor(): String
}

class PadThai extends Noodle {
    override def flavor(): String = "Thai flavor"
}

class Spaghetti extends Noodle {
    override def flavor(): String = "Italian flavor"
}
