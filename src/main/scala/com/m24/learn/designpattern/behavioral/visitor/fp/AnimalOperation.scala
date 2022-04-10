package com.m24.learn.designpattern.behavioral.visitor.fp

object AnimalOperation {
    def speak(animal: Animal): Unit = animal match {
        case monkey: Monkey => println("Ooh oo aa aa!")
        case lion: Lion => println("Roaaar!")
        case dolphin: Dolphin => println("Tuut tuttu tuutt!")
        case _ => // do nothing
    }

    def swim(animal: Animal): Unit = animal match {
        case dolphin: Dolphin => println("Dolphin swim fast!")
        case _ => // do nothing
    }
}
