package com.m24.learn.designpattern.behavioral.command.oo

import scala.collection.mutable

class RemoteController {
    private val undoStack = mutable.ArrayStack[Command]()
    private val redoStack = mutable.ArrayStack[Command]()

    def invoke(cmd: Command, tv: Television): Unit = {
        cmd.execute(tv)
        undoStack.push(cmd)
        redoStack.clear()
    }

    def undo(): Unit = {
        if (undoStack.nonEmpty) {
            val cmd = undoStack.pop()
            redoStack.push(cmd)
            cmd.undo()
        }
    }

    def redo(): Unit = {
        if (redoStack.nonEmpty) {
            val cmd = redoStack.pop()
            undoStack.push(cmd)
            cmd.redo()
        }
    }
}
