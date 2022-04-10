package com.m24.learn.designpattern.behavioral.state

trait KeyboardState {
    def write(word: String): Unit
}

class UpperCaseState extends KeyboardState {
    override def write(word: String): Unit = {
        println(word.toUpperCase())
    }
}

class LowerCaseState extends KeyboardState {
    override def write(word: String): Unit = {
        println(word.toLowerCase())
    }
}
