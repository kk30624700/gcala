package com.m24.learn.designpattern.structural.adapter

trait Weapon {
    def fire(): String
}

class AK47 extends Weapon {
    override def fire(): String = {
        "fire with AK47"
    }
}
