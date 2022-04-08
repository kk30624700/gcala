package com.m24.learn.designpattern.behavioral.observer.oo

object Console extends App {
    val tv = new Television()
    val remote = new RemoteController()

    remote.invoke(new SetChannelCommand(1), tv)
    remote.invoke(new SetChannelCommand(5), tv)
    remote.invoke(new SetVolumeCommand(3), tv)
    remote.invoke(new SetVolumeCommand(20), tv)
    tv.show()

    remote.undo()
    remote.undo()
    remote.undo()
    remote.undo()
    remote.undo()
    remote.undo()
    tv.show()

    remote.redo()
    remote.redo()
    remote.redo()
    tv.show()
}
