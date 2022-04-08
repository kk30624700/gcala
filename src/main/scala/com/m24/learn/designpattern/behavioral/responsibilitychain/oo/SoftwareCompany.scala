package com.m24.learn.designpattern.behavioral.responsibilitychain.oo

class SoftwareCompany {
  val chain: RequestHandler = {
    new Developer(new Architect(new CTO(null)))
  }

  def handleRequest(req: Request): Unit = {
    chain.handleRequest(req)
  }
}
