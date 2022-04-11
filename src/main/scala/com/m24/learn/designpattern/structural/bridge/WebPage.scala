package com.m24.learn.designpattern.structural.bridge

abstract class WebPage(protected var theme: Theme) {
    def getContent: String

    def changeTheme(newTheme: Theme): Unit = {
        theme = newTheme
    }
}

class AboutPage(aboutTheme: Theme) extends WebPage(aboutTheme) {
    override def getContent: String = "About page in " + theme.getColor
}

class HelpPage(helpTheme: Theme) extends WebPage(helpTheme) {
    override def getContent: String = "Help page in " + theme.getColor
}
