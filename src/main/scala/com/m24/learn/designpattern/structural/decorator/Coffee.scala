package com.m24.learn.designpattern.structural.decorator

trait Coffee {
    def getCost: Int
    def getDescription: String
}

class SimpleCoffee extends Coffee {
    override def getCost: Int = 10
    override def getDescription: String = "Simple coffee "
}

trait MilkAdded extends Coffee {
    abstract override def getCost: Int = super.getCost + 5
    abstract override def getDescription: String = super.getDescription + "with milk "
}

trait SugarAdded extends Coffee {
    abstract override def getCost: Int = super.getCost + 3
    abstract override def getDescription: String = super.getDescription + "with sugar "
}