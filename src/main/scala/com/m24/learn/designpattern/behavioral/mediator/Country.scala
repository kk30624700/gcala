package com.m24.learn.designpattern.behavioral.mediator

abstract class Country(val name: String) {
  protected var organization: Organization = _

  def join(org: Organization): Unit = {
    organization = org
  }

  def declare(msg: String): Unit = {
    organization.countryDeclare(this, msg)
  }

  def receive(msg: String): Unit = {
    println(s"$name received: '$msg'")
  }
}

class USA extends Country("USA")
class China extends Country("China")
class Canada extends Country("Canada")
