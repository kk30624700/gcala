package com.m24.learn.designpattern.behavioral.responsibilitychain.fp

object RequestHandler {
  type Type = PartialFunction[Request, Response]

  val developer: RequestHandler.Type = {
    case req@FixBugRequest(desc) => {
      println(s"i am a developer. i can fix this bug: $desc")
      Response(req, handled = true)
    }
  }

  val architect: RequestHandler.Type = {
    case req@FeatureRequest(desc) => {
      println(s"i am a architect. i can implement this feature: $desc")
      Response(req, handled=true)
    }
  }

  val CTO: RequestHandler.Type = {
    case req@ProductRequest(desc) => {
      println(s"i am a CTO, i can make this product: $desc")
      Response(req, handled = true)
    }
  }

  val noOne: RequestHandler.Type = {
    case req:Request => {
      println("no one responses to this request")
      Response(req, handled=false)
    }
  }
}
