package com.example

/** embedded server */
object Server {
  val logger = org.clapper.avsl.Logger(Server.getClass)
  
  def main(args: Array[String]) {
    logger.info("starting unfiltered app at localhost on port %s" format 8080)
    unfiltered.netty.Http(8080).handler(Palindrome).run
  }
}
