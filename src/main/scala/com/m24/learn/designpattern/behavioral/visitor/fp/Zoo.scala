package com.m24.learn.designpattern.behavioral.visitor.fp

class Zoo(animals: Animal*) {
    def accept(operation: Animal.Operation): Unit = {
        animals.foreach {
            _.accept(operation)
        }
    }
}
