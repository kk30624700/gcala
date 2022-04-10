package com.m24.learn.designpattern.behavioral.visitor.oo

class Zoo(animals: Animal*) {
    def accept(operation: AnimalOperation): Unit = {
        animals.foreach({
            _.accept(operation)
        })
    }
}
