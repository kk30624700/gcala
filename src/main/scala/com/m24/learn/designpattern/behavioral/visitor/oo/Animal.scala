package com.m24.learn.designpattern.behavioral.visitor.oo

trait Animal {
    def accept(operation: AnimalOperation)
}

class Monkey extends Animal {
    override def accept(operation: AnimalOperation): Unit = {
        operation.visitMonkey(this)
    }
}

class Lion extends Animal {
    override def accept(operation: AnimalOperation): Unit = {
        operation.visitLion(this)
    }
}

class Dolphin extends Animal {
    override def accept(operation: AnimalOperation): Unit = {
        operation.visitDolphin(this)
    }
}


