package com.m24.learn.designpattern.structural.flyweight

trait Tea {
    val name: String
    def serve(table: Int): Unit = {
        println(s"Serving $name to table # $table. hashCode: $hashCode")
    }
}

class GreenTea extends Tea {
    override val name: String = "Green Tea"
}

class UnsharedTea extends Tea {
    override val name: String = "Unshared Tea"

    val price = 10

    override def serve(table: Int): Unit = {
        println(s"Serving $name to table# $table. Price is $price. hashCode: $hashCode()")
    }
}

object Tea {
    trait Type
    case object GreenTea extends Type
    case object UnsharedTea extends Type
}