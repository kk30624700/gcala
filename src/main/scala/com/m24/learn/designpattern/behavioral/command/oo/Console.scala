package com.m24.learn.designpattern.behavioral.command.oo

object Console extends App {
    val tv = new Television()
    val remote = new RemoteController()

    remote.invoke(new SetChannelCommand(1), tv)
    tv.show()
    remote.invoke(new SetChannelCommand(5), tv)
    tv.show()
    remote.invoke(new SetVolumeCommand(3), tv)
    tv.show()
    remote.invoke(new SetVolumeCommand(20), tv)
    tv.show()

    remote.undo()
    tv.show()
    remote.undo()
    tv.show()
    remote.undo()
    tv.show()
    remote.undo()
    tv.show()
    remote.undo()
    tv.show()
    remote.undo()
    tv.show()

    remote.redo()
    tv.show()
    remote.redo()
    tv.show()
    remote.redo()
    tv.show()
}
