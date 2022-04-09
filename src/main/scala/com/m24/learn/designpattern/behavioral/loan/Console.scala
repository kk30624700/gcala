package com.m24.learn.designpattern.behavioral.loan

object Console extends App {
    using(new FakeFile) {
        file => println(file.content)
    }
}

class FakeFile {
    def close(): Unit = {
        println("closing fake file")
    }

    def content: String = {
        "This is a Fake File"
    }
}
