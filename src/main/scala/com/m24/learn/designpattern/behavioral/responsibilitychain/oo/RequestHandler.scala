package com.m24.learn.designpattern.behavioral.responsibilitychain.oo

abstract class RequestHandler(next: RequestHandler) {
    def handleRequest(req: Request): Unit = {
        if (next != null) {
            next.handleRequest(req)
        } else {
            println("no one responses to this request")
        }
    }
}

class Developer(next: RequestHandler) extends RequestHandler(next) {
    override def handleRequest(req: Request): Unit = req match {
        case FixBugRequest(desc) => {
            println(s"i am a developer. i can fix this bug: $desc")
            req.markHandled()
        }
        case _ => {
            super.handleRequest(req)
        }
    }
}

class Architect(next: RequestHandler) extends RequestHandler(next) {
    override def handleRequest(req: Request): Unit = req match {
        case FeatureRequest(desc) => {
            println(s"i am an architect. i can implement this feature: $desc")
            req.markHandled()
        }
        case _ => {
            super.handleRequest(req)
        }
    }
}

class CTO(next: RequestHandler) extends RequestHandler(next) {
    override def handleRequest(req: Request): Unit = req match {
        case ProductRequest(desc) => {
            println(s"i am a cto. i can make this product: $desc")
            req.markHandled()
        }
        case _ => {
            super.handleRequest(req)
        }
    }
}
