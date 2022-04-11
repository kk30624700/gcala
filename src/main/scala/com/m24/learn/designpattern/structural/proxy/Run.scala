package com.m24.learn.designpattern.structural.proxy

object Run extends App {
    val computer = new LinuxComputer()
    val ssh = new SecurityShell(computer)
    println(ssh.run("shutdown"))
    println(ssh.run("cd /root"))
}
