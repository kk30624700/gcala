package com.m24.learn.designpattern.behavioral.state

object Console extends  App {
    val keyboard = new Keyboard

    keyboard.write("hello world")
    keyboard.pressCapsLock()
    keyboard.write("hello world")
    keyboard.pressCapsLock()
    keyboard.write("hello world")
}
