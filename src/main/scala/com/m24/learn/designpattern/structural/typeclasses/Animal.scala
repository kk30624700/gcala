package com.m24.learn.designpattern.structural.typeclasses

trait Animal

class Monkey extends Animal

class Lion extends Animal

object Animal {
    implicit object SpeakableMonkey extends Speakable[Monkey] {
        override def say(): String = "i'm monkey, Ooh oo aa aa"
    }
    implicit object SpeakableLion extends Speakable[Lion] {
        override def say(): String = "I'm Lion. Roaaar!"
    }

    implicit def monkey2SpeakableMonkey(monkey: Monkey): Speakable[Monkey] = {
        SpeakableMonkey
    }
}