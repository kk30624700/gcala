package com.m24.learn.designpattern.behavioral.command.fp

object Console extends App {
    val remote = new RemoteController(Television())
    remote.invoke(Command.setChannel(1))
    remote.invoke(Command.setChannel(5))
    remote.invoke(Command.setVolume(3))
    remote.invoke(Command.setVolume(20))
    println(remote.get())
    remote.undo()
    remote.undo()
    remote.undo()
    remote.undo()
    remote.undo()
    remote.undo()
    println(remote.get())
    remote.redo()
    remote.redo()
    remote.redo()
    println(remote.get())
}
