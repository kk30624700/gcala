package com.m24.learn.designpattern.behavioral.command.fp

object Command {
    type Type = (Television) => Television

    def setChannel(channel: Int)(tv: Television): Television = {
        Television(channel, tv.volumn)
    }

    def setVolume(volume: Int)(tv: Television): Television = {
        Television(tv.channel, volume)
    }
}
