package com.m24.learn.designpattern.behavioral.command.fp

import scala.collection.mutable

class RemoteController(tv: Television) {
    private val historyStack = mutable.ArrayStack[Command.Type]()
    private val redoStack = mutable.ArrayStack[Command.Type]()

    def invoke(cmd: Command.Type): Unit = {
        historyStack.push(cmd)
    }

    def undo(): Unit = {
        if (historyStack.nonEmpty) {
            val cmd = historyStack.pop()
            redoStack.push(cmd)
        }
    }

    def redo(): Unit = {
        if (redoStack.nonEmpty) {
            val cmd = redoStack.pop()
            historyStack.push(cmd)
        }
    }

    def get(): Television = {
        historyStack.foldRight(tv)((cmd, tv) => cmd(tv))
    }
}
