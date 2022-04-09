package com.m24.learn.base.generic

object ViewBound {
    def main(args: Array[String]): Unit = {
        val p1 = new Person("A", 12)
        val p2 = new Person("B", 13)

        val comp = new CompareComm(p1, p2)

        println(comp.getter)
        println(comp.geatter)
    }

    class Person(val name: String, val age: Int) {
        override def toString: String = this.name + " " + this.age
    }

    class CompareComm[T <% Ordered[T]](obj1: T, obj2: T) {
        def getter = if (obj1>obj2) obj1 else obj2

        def geatter = if (obj1.compareTo(obj2)>0) obj1 else obj2
    }

    object Person {
        implicit def personToOrdered(p: Person) : Ordered[Person] = new Ordered[Person] {
            override def compare(that: Person): Int = {
                p.age - that.age
            }
        }
    }
}

