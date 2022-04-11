package com.m24.learn.designpattern.structural.composite

object Run extends App {
    val action = new CompositeAction(new Forward, new TurnLeft, new TurnRight)
    action.act()
}
