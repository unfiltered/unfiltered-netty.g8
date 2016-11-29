organization := "com.example"

name := "$name$"

scalacOptions += "-deprecation"

version := "$version$"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-netty-server" % "$unfiltered_version$",
   "net.databinder.dispatch" %% "dispatch-core" % "$dispatch_version$",
   "net.databinder" %% "unfiltered-specs2" % "$unfiltered_version$" % "test"
)
