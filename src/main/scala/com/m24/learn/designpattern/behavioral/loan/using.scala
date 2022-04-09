package com.m24.learn.designpattern.behavioral.loan

object using {
    def apply[R <: {def close() : Unit}, T](resource: => R)(f: R => T): T = {
        val source = Option(resource)
        try {
            f(source.get)
        } finally {
            for (s <- source)
                s.close()
        }
    }
}
