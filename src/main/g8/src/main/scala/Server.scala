package com.example

/** embedded server */
object Server {
  def main(args: Array[String]) {
    unfiltered.netty.Server.http(8080)
      .handler(Palindrome)
      .handler(Time)
      .run { s =>
        unfiltered.util.Browser.open(s.portBindings.head.url + "/time")
      }
    dispatch.Http.shutdown()
  }
}
