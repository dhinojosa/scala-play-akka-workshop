lazy val play_project:Project = project.in(file("play_project")).enablePlugins(PlayScala).settings(
  name := "play_project",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.11.5",
  libraryDependencies ++= Seq(
    jdbc,
    anorm,
    cache,
    "org.webjars" %% "webjars-play" % "2.3.0-2",
    "org.webjars" % "bootstrap" % "3.3.1",
    "org.webjars" % "jquery" % "2.1.1",
    "org.webjars" % "jquery-ui" % "1.11.2",
    "org.webjars" % "font-awesome" % "4.2.0",
    "joda-time" % "joda-time" % "2.6",
    "com.typesafe.akka" %% "akka-remote" % "2.3.9"
  )
)

lazy val akka_project = project.in(file("akka_project")).settings(
  name := "akka_project",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.11.5",
  scalacOptions ++= Seq("-feature", "-deprecation"),
  javacOptions ++= Seq("-Xlint:unchecked"),
  libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.9" % "test",
  "com.typesafe.akka" %% "akka-remote" % "2.3.9",
  "com.typesafe.akka" %% "akka-kernel" % "2.3.9",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test")
)

lazy val scala_project = project.in(file("scala_project")).settings(
  name := "scala_project",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.11.5",
  scalacOptions ++= Seq("-feature", "-deprecation"),
  javacOptions ++= Seq("-Xlint:unchecked"),
  libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.4" % "test")
)

lazy val root = project.in(file(".")).aggregate(akka_project, play_project, scala_project).settings (
  name := "Scala Play Akka Project"
)
