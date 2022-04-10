package com.m24.learn.designpattern.other.monad

object Run extends App {

    Validator("hello")
        .validate(_.length > 6)
        .flatMap(x => Valid(x.substring(6))) match {
            case Valid(s) => println(s)
            case Illegal => println("Illegal")
        }

    Validator("hello world")
        .validate(_.length > 6)
        .flatMap(x => Valid(x.substring(6).length)) match {
            case Valid(s) => println(s)
            case Illegal => println("Illegal")
        }
}
