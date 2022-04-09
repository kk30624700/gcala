package com.m24.learn

object Main {
    def main(args:Array[String]): Unit = {
        import lib.Jutil
        Jutil.run()

        def f() = 1;

        def n(): String = {
            "aba"
        }

        println(f.getClass)
        println(n())
    }
}
