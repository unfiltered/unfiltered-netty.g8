package com.example

import org.specs2.mutable.Specification

import okhttp3._

object ExampleSpec extends Specification with unfiltered.specs2.netty.Served {

  def setup = { _.handler(Palindrome) }

  val http = new OkHttpClient()

  "The example app" should {
    "serve unfiltered text" in {
      val request = new Request.Builder().url(host).build()
      val response = http.newCall(request).execute()
      response.code must_== 200
      response.body.string must contain("What say you")
    }
  }
}
