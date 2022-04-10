package com.m24.learn.designpattern.creational.abstractfactory

class Car(factory: CarFactory) {
    val engin = factory.createEngine()
    val wheel = factory.createWheel()
    val brand = factory.createBrand()

    def drive(): Unit = {
        brand.light()
        engin.start()
        wheel.rotate()
    }
}
