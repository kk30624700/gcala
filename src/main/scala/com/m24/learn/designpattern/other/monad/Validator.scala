package com.m24.learn.designpattern.other.monad

abstract class Validator[+A] {
    protected val isValid: Boolean

    def get: A

    def validate(p: A=>Boolean): Validator[A] = {
        if (!isValid) Illegal
        else if (!p(this.get)) Illegal
        else this
    }

    def flatMap[B](f: A => Validator[B]): Validator[B] = {
        if (isValid) f(this.get) else Illegal
    }
}

object Validator {
    def apply[A](testee: A): Validator[A] = new Valid[A] (testee)
}

case class Valid[+A](testee: A) extends Validator[A] {
    override protected val isValid: Boolean = true
    override def get: A = testee
}

case object Illegal extends Validator[Nothing] {
    override protected val isValid: Boolean = false
    override def get = throw new IllegalStateException()
}