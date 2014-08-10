package com.example

import unfiltered.request._
import unfiltered.response._

import unfiltered.netty._

import scala.concurrent.{ExecutionContext,Future}

/** Asynchronous plan that gets the time in a ridiculous fashion.
 *  (But imagine that it's using a vital external HTTP service to
 *  inform its response--this is a fine way to do that.) */
@io.netty.channel.ChannelHandler.Sharable
object Time extends future.Plan
  with ServerErrorResponse {
  implicit def executionContext = ExecutionContext.Implicits.global
  
  def intent = {
    case req @ GET(Path("/time")) => 
      import dispatch._
      // the call below is non-blocking, so we return quickly
      // and free netty's worker thread
      for {
        time <- Http(host("127.0.0.1", 8080).POST / "time" > as.String)
      } yield {
        // in a future, we respond to the request
        view(time)
      }
    case req @ POST(Path("/time")) =>
      // since we don't have to do any blocking IO for this request
      // we can respond immediately
      Future.successful(ResponseString(new java.util.Date().toString))
  }
  def view(time: String) = {
    Html(
     <html><body>
       The current time is: { time }
     </body></html>
   )
  }
}
