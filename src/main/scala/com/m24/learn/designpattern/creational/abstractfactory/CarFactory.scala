package com.m24.learn.designpattern.creational.abstractfactory

trait CarFactory {
    def createEngine(): Engine
    def createWheel(): Wheel
    def createBrand(): Brand
}

object AudiCarFactory extends CarFactory {
    override def createEngine(): Engine = new V6Engine()

    override def createWheel(): Wheel = new DunlopWheel()

    override def createBrand(): Brand = new AudiBrand
}

object BMWCarFactory extends CarFactory {
    override def createEngine(): Engine = new V8Engine()

    override def createWheel(): Wheel = new MichelinWheel()

    override def createBrand(): Brand = new BMWBrand
}