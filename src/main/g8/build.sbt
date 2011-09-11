organization := "com.example"

name := "$name$"

version := "$version$"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-netty" % "$unfiltered_version$",
   "org.clapper" %% "avsl" % "0.3.1",
   "net.databinder" %% "unfiltered-spec" % "$unfiltered_version$" % "test",
   "org.scala-tools.testing" %% "specs" % "1.6.8" % "test",
   "net.databinder" %% "dispatch-http" % "0.8.5" % "test"
)

resolvers ++= Seq(
  "jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"
)