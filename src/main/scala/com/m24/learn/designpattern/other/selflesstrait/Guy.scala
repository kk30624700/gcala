package com.m24.learn.designpattern.other.selflesstrait

trait Human

class Guy extends Human with Friendly {

}

class KindGuy extends Human {
    import Friendly.{greet => sayHi}

    def greet(): String = sayHi() + " have a nice day"
}
