package com.m24.learn.base.generic

object ContextBound {
    implicit val personContext = new Ordering[Person]{
        override def compare(x: Person, y: Person): Int = {
            x.age - y.age
        }
    }
    def main(args: Array[String]): Unit = {
        val p1 = new Person("a",12)
        val p2 = new Person("b", 13)

        val cmp1 = new CompareComm1[Person](p1, p2)
        println(cmp1.geatter)

        val cmp2 = new CompareComm2[Person](p1, p2)
        println(cmp2.geatter)

        val cmp3 = new CompareComm1[Person](p1, p2)
        println(cmp3.geatter)
    }

    class Person(val name: String, val age: Int) {
        override def toString: String = this.name + " " + this.age
    }

    class CompareComm1[T: Ordering](obj1: T, obj2: T) (implicit comparetor: Ordering[T]) {
        def geatter = if (comparetor.compare(obj1, obj2) > 0) obj1 else obj2
    }

    class CompareComm2[T: Ordering](o1: T, o2: T) {
        def geatter = {
            def f(implicit cmptor: Ordering[T]) = cmptor.compare(o1, o2)
            println(f)
            if (f>0) o1 else o2
        }
    }

    class CompareComm3[T: Ordering](o1: T, o2: T) {
        def getter = {
            val cmp = implicitly[Ordering[T]]

            println("cmp hashcode = ", cmp.hashCode())

            if (cmp.compare(o1, o2)>0) o1 else o2
        }
    }
}




