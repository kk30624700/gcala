package com.m24.learn.base.generic

object Bound {
    def main(args: Array[String]): Unit = {
        upBound(Seq(new Bird, new Animal))
        downBound(Seq(new Earth))
    }

    def upBound[T <: Animal] (things: Seq[T]) = things.foreach(_.sound)

    def downBound[T >: Animal] (things: Seq[T]) = things
}

class Earth {
    def sound(): Unit = {
        println("hello")
    }
}

class Animal extends Earth {
    override def sound(): Unit = {
        println("animal sound")
    }
}

class Bird extends Animal {
    override def sound(): Unit = {
        println("bird sounds")
    }
}


