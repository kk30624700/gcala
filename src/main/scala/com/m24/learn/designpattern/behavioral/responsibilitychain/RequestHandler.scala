package com.m24.learn.designpattern.behavioral.responsibilitychain

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
        }
    }
}
