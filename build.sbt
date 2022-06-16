import sbt.Keys._
import sbt._

lazy val root = (project in file("."))
  .settings(
    name := "finalibre-sbt-swagger-codegen",
    startYear := Some(2022),
    sbtPlugin := true,
    scalaVersion := "2.13.8",
    logLevel := Level.Info,
    //crossScalaVersions := List("3.1.2", "3.0.2", "2.13.8", "2.12.16")
    crossScalaVersions := List("2.13.8"),
    libraryDependencies ++= Seq(
      "io.swagger.codegen.v3" % "swagger-codegen-cli" % "3.0.34"
    )
  )
