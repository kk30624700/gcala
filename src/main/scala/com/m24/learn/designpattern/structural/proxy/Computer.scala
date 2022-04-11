package com.m24.learn.designpattern.structural.proxy

trait Computer {
    def run(command: String): String
}

class LinuxComputer extends Computer {
    override def run(command: String): String = s"running 'Scommand' in linux"
}

class SecurityShell(realComputer: Computer) extends Computer {
    override def run(command: String): String = {
        if (command == "shutdown") {
            "shutdown is prohibited"
        } else {
            realComputer.run(command)
        }
    }
}