package com.m24.learn.designpattern.behavioral.responsibilitychain.oo

sealed trait Request {
    private var handled = false
    def markHandled(): Unit = {
        handled = true
    }
    def isHandled: Boolean = handled
}

case class FixBugRequest(desc: String) extends Request

case class FeatureRequest(desc: String) extends Request

case class ProductRequest(desc: String) extends Request

case class FakeRequest(desc: String) extends Request
