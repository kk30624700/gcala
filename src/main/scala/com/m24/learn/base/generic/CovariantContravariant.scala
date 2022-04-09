package com.m24.learn.base.generic

object CovariantContravariant {
    def main(args: Array[String]): Unit = {
        val t1: Temp1[Sub] = new Temp1[Sub]("hello")
//        val t2: Temp1[Sub] = new Temp1[Super]("hello")
        val t3: Temp1[Super] = new Temp1[Sub]("hello")

        val t4: Temp2[Sub] = new Temp2[Sub]("hello")
        val t5: Temp2[Sub] = new Temp2[Super]("hello")
//        val t6: Temp2[Super] = new Temp2[Sub]("hello")

        val t7: Temp3[Sub] = new Temp3[Sub]("hello")
//        val t8: Temp3[Sub] = new Temp3[Super]("hello")
//        val t9: Temp3[Super] = new Temp3[Sub]("hello")
    }

    class Temp1[+A](title: String) {
        override def toString: String = title
    }

    class Temp2[-A](title: String) {
        override def toString: String = title
    }

    class Temp3[A](title: String) {
        override def toString: String = title
    }

    class Super

    class Sub extends Super
}
