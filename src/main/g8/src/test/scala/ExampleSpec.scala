package com.example

import org.specs2.mutable.Specification

import dispatch.classic._

object ExampleSpec extends Specification with unfiltered.specs2.netty.Served {
  
  def setup = { _.handler(Palindrome) }
  
  "The example app" should {
    "serve unfiltered text" in {
      Http(host as_str) must contain("What say you")
    }
  }
}
