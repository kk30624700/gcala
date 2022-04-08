package com.m24.learn.designpattern.behavioral.resposibilitychain

import com.m24.learn.designpattern.behavioral.responsibilitychain.fp.{FakeRequest, FeatureRequest, FixBugRequest, Response, SoftwareCompany}
import org.scalatest.{FlatSpec, Matchers}

class FpChainSpec extends FlatSpec with Matchers {
  it should "handle the requests" in {
    val company = new SoftwareCompany()

    val bug = FixBugRequest("a new bug")
    company.handleRequest(bug) should be(Response(bug, handled = true))

    val feature = FeatureRequest("a new feature")
    company.handleRequest(feature) should be(Response(feature, handled = true))

  }

  it should "not handle the request" in {
    val company = new SoftwareCompany()

    val fake = FakeRequest("just a kidding")
    company.handleRequest(fake) should be(Response(fake, handled = false))

  }
}
