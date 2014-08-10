organization := "com.example"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-netty-server" % "$unfiltered_version$",
   "net.databinder.dispatch" %% "dispatch-core" % "0.11.1",
   "net.databinder" %% "unfiltered-specs2" % "$unfiltered_version$" % "test"
)

resolvers ++= Seq(
  "jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"
)
