package com.m24.learn.designpattern.behavioral.visitor.oo

trait AnimalOperation {
    def visitMonkey(monkey: Monkey): Unit = {

    }
    def visitLion(lion: Lion): Unit ={

    }
    def visitDolphin(dolphin: Dolphin): Unit = {

    }
}

class Speak extends AnimalOperation {
    override def visitMonkey(monkey: Monkey): Unit = println("Ooh oo aa aa!")

    override def visitLion(lion: Lion): Unit = println("Roaaar!")

    override def visitDolphin(dolphin: Dolphin): Unit = println("Tuut tuttu tuutt!")
}

class Swim extends AnimalOperation {
    override def visitDolphin(dolphin: Dolphin): Unit = println("Dolphin swim fast!")
}