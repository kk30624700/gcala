package com.m24.learn.designpattern.structural.bridge

object Run extends App {
    val about = new AboutPage(new DarkTheme)
    println(about.getContent)

    val help = new HelpPage(new LightTheme)
    println(help.getContent)

    help.changeTheme(new DarkTheme)
    println(help.getContent)
}
