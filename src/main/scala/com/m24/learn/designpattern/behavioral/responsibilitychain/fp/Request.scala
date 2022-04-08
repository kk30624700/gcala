package com.m24.learn.designpattern.behavioral.responsibilitychain.fp

sealed abstract class Request

case class FixBugRequest(desc: String) extends Request
case class FeatureRequest(desc: String) extends Request
case class ProductRequest(desc: String) extends Request
case class FakeRequest(desc: String) extends Request

