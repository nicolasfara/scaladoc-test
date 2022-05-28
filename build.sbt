val scala3Version = "3.1.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scaladoc-test",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,

    Compile / doc / target := file("output"),
    Compile / doc/ scalacOptions ++= Seq(
      "-siteroot", "docs",
    )
  )
