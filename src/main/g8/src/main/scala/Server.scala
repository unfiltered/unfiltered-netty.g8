package com.example

/** embedded server */
object Server {
  def main(args: Array[String]): Unit = {
    unfiltered.netty.Server.http(8080)
      .handler(Palindrome)
      .run { s =>
      }
  }
}
