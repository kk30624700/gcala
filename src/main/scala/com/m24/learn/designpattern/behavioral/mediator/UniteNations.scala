package com.m24.learn.designpattern.behavioral.mediator

import scala.collection.mutable.ListBuffer

trait Organization {
  def countryDeclare(country: Country, msg: String): Unit
}

class UniteNations extends Organization {
  val countries = new ListBuffer[Country]()

  def addMember(country: Country): Unit = {
    country.join(this)
    countries.append(country)
  }

  override def countryDeclare(country: Country, msg: String): Unit = {
    println(s"${country.name} declared: ${msg}")
    for (c <- countries if c != country) {
      c.receive(msg)
    }
  }
}
