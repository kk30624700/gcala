package com.m24.learn.base.generic

object Base extends App {
    val intMsg = new Message[Int](123)
    println(intMsg.get)
    val strMsg = new Message[String]("123")
    println(strMsg.get)

    def midList[E](l: List[E]): E = {
        l(l.length/2)
    }

    val l1 = List("hello", "dog", "world")
    val l2 = List(1, 2, 3)
    println(midList[String](l1))
    println(midList[Int](l2))

    import SeasonEnum._

    val class01 = new EnglishClass[SeasonEnum, String, String](spring, "0705", "HIGH")
    println(s"class01 ${class01.classSeason} ${class01.className} ${class01.classType}")

    val class02 = new EnglishClass[SeasonEnum, String, Int](spring, "0705", 1)
    println(s"class01 ${class02.classSeason} ${class02.className} ${class02.classType}")

}

class Message[T](s: T) {
    def get = s
}

class EnglishClass[A, B, C](val classSeason: A, val className: B, val classType: C)

object SeasonEnum extends Enumeration {
    type SeasonEnum = Value
    val spring,autumn,summer,winter = Value
}
