package com.m24.learn.designpattern.creational.factorykit

import scala.collection.mutable

class WeaponFactoryKit(dict: Map[String, ()=>Weapon]) {
    def create(key: String): Weapon = {
        dict.get(key).get()
    }
}

object WeaponFactoryKit {
    def factory(builder: mutable.Map[String, ()=>Weapon] => Unit): WeaponFactoryKit = {
        val dict = mutable.Map[String, ()=> Weapon]()
        builder(dict)
        new WeaponFactoryKit(dict.toMap)
    }

}
