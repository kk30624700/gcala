package com.m24.learn.designpattern.creational.factorykit

object Run extends App {
    val factory = WeaponFactoryKit.factory { builder =>
        builder.put("axe", () => new Axe())
        builder.put("bow", () => new Bow())
        builder.put("sword", () => new Sword())
    }

    val axe = factory.create("axe")
    println(axe)
}
