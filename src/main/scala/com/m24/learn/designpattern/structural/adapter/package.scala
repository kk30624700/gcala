package com.m24.learn.designpattern.structural

package object adapter {
    implicit class Knife2WeaponAdapter(knife: Knife) extends Weapon {
        override def fire(): String = knife.stab()
    }
}
