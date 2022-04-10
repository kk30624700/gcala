package com.m24.learn.designpattern.behavioral.state

class Keyboard {
    var state: KeyboardState = new LowerCaseState

    def write(word: String): Unit = {
        state.write(word)
    }

    def pressCapsLock(): Unit = state match {
        case lower: LowerCaseState => state = new UpperCaseState
        case upper: UpperCaseState => state = new LowerCaseState
    }
}
