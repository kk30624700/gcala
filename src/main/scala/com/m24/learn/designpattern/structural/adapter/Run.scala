package com.m24.learn.designpattern.structural.adapter

object Run extends App {
    val soldier = new Soldier()
    println(soldier.fightWith(new AK47()))
    println(soldier.fightWith(new Knife()))
}
