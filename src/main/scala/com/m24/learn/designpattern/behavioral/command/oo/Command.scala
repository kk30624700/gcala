package com.m24.learn.designpattern.behavioral.command.oo

trait Command {
    def execute(tv: Television): Unit
    def undo(): Unit
    def redo(): Unit
}

class SetChannelCommand(channel: Int) extends Command {
    var targetTv: Television = _
    var preChannel: Int = -1

    override def execute(tv: Television): Unit = {
        targetTv = tv
        preChannel = tv.channel
        targetTv.channel = channel
    }

    override def redo(): Unit = {
        if (targetTv != null) {
            targetTv.channel = channel
        }
    }

    override def undo(): Unit = {
        if (targetTv != null) {
            targetTv.channel = preChannel
        }
    }
}

class SetVolumeCommand(volume: Int) extends Command {
    var targetTv: Television = _
    var preVolume: Int = -1

    override def execute(tv: Television): Unit = {
        targetTv = tv
        preVolume = tv.volume
        targetTv.volume = volume
    }

    override def undo(): Unit = {
        if (targetTv != null) {
            targetTv.volume = volume
        }
    }

    override def redo(): Unit = {
        if (targetTv != null) {
            targetTv.volume = preVolume
        }
    }
}
