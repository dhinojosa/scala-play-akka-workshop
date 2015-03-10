// Comment to get more information during initialization
logLevel := Level.Warn

resolvers ++= Seq("Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/")

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.7")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "3.0.0")
