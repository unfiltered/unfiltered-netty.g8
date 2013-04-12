organization := "com.example"

name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-netty-server" % "$unfiltered_version$",
   "net.databinder.dispatch" %% "core" % "0.10.0",
   "org.clapper" %% "avsl" % "1.0.1",
   "net.databinder" %% "unfiltered-spec" % "$unfiltered_version$" % "test"
)

resolvers ++= Seq(
  "jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"
)
