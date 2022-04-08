package com.m24.learn.designpattern.behavioral.responsibilitychain.fp

object Console extends App {
  val company = new SoftwareCompany

  company.handleRequest(FixBugRequest("bug"))
  company.handleRequest(FeatureRequest("feature"))
  company.handleRequest(ProductRequest("product"))
  company.handleRequest(FakeRequest("fake"))
}
