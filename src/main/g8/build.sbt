organization := "com.example"

name := "$name$"

version := "$version$"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-netty-server" % "$unfiltered_version$",
   "net.databinder.dispatch" %% "core" % "0.9.0-alpha2",
   "org.clapper" %% "avsl" % "0.3.6",
   "net.databinder" %% "unfiltered-spec" % "$unfiltered_version$" % "test"
)

resolvers ++= Seq(
  "jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"
)