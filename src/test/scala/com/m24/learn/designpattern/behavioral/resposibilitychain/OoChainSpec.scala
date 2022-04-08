package com.m24.learn.designpattern.behavioral.resposibilitychain

import com.m24.learn.designpattern.behavioral.responsibilitychain.oo.{FakeRequest, FeatureRequest, FixBugRequest, SoftwareCompany}
import org.scalatest.{FlatSpec, Matchers}

class OoChainSpec extends FlatSpec with Matchers{
    it should "handle the requests" in {
        val company = new SoftwareCompany

        val bug = FixBugRequest("a new bug")
        company.handleRequest(bug)
        bug.isHandled should be(true)

        val feature = FeatureRequest("a new feature")
        company.handleRequest(feature)
        feature.isHandled should be(true)
    }

    it should "no one responses to this request" in {
        val company = new SoftwareCompany
        val fake = FakeRequest("just a kidding")
        company.handleRequest(fake)
        fake.isHandled should be(false)
    }
}
