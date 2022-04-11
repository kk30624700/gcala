package com.m24.learn.designpattern.structural.bridge

trait Theme {
    def getColor: String
}

class DarkTheme extends Theme {
    override def getColor: String = "Dark Black"
}

class LightTheme extends Theme {
    override def getColor: String = "Off Withe"
}