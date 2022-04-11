package com.m24.learn.designpattern.structural.typeclasses

class Human {
    def sayHelloTo[A](target: A)(implicit s: Speakable[A]): String = {
        s"Human say hello, get reply: ${s.say()}"
    }

    def sayHelloTo[A](target: Speakable[A]): String = {
        s"Human say hello, get reply: ${target.say()}"
    }
}
