package com.m24.learn.designpattern.behavioral.responsibilitychain.fp

class SoftwareCompany {
  val chain: RequestHandler.Type = {
    RequestHandler.developer orElse RequestHandler.architect orElse RequestHandler.CTO orElse RequestHandler.noOne
  }

  def handleRequest(req: Request): Response = {
    chain(req)
  }
}
