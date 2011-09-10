organization := "com.example"

name := "$name$"

version := "$version$"

libraryDependencies ++= Seq(
   "net.databinder" %% "unfiltered-netty-server" % "$unfiltered_version$",
   "net.databinder" %% "dispatch-nio" % "0.8.5",
   "org.clapper" %% "avsl" % "0.3.1"
)

resolvers ++= Seq(
  "jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"
)