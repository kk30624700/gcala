package com.m24.learn.designpattern.structural.composite

trait Action {
    def act(): Unit
}

class TurnRight extends Action {
    override def act(): Unit = println("turn right")
}

class TurnLeft extends Action {
    override def act(): Unit = println("turn left")
}

class Forward extends Action {
    override def act(): Unit = println("go forward")
}

class CompositeAction(actions: Action*) extends Action {
    override def act(): Unit = {
        actions.foreach(_.act())
    }
}