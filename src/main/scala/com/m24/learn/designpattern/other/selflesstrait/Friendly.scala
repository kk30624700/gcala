package com.m24.learn.designpattern.other.selflesstrait

trait Friendly {
    def greet(): String = "hello"
}

object Friendly extends Friendly
