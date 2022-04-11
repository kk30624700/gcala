package com.m24.learn.designpattern.structural.adapter

class Soldier {
    def fightWith(weapon: Weapon): String = {
        weapon.fire()
    }
}
