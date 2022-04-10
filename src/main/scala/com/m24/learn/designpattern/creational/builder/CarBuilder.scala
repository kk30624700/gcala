package com.m24.learn.designpattern.creational.builder

trait CarBuilder {
    def setEngine(engine: String): CarBuilder
    def setWheels(wheels: Int): CarBuilder
    def setColor(color: String): CarBuilder

    def build(): Car
}

class DIYCarBuilder extends CarBuilder {
    private var engine = ""
    private var wheels = 0
    private var color = ""

    override def setEngine(engine: String): CarBuilder = {
        this.engine = engine
        this
    }

    override def setColor(color: String): CarBuilder = {
        this.color = color
        this
    }

    override def setWheels(wheels: Int): CarBuilder = {
        this.wheels = wheels
        this
    }

    override def build(): Car = {
        Car(engine, wheels, color)
    }
}
