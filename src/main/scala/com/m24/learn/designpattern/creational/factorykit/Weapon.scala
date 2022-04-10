package com.m24.learn.designpattern.creational.factorykit

trait Weapon

class Axe extends Weapon {
    override def toString: String = "Axe"
}

class Sword extends Weapon {
    override def toString: String = "Sword"
}

class Bow extends Weapon {
    override def toString: String = "Bow"
}