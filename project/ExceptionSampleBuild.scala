import sbt._
import sbt.Keys._

object ExceptionSampleBuild extends Build {

  lazy val exceptionSample = Project(
    id = "exception-sample",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Exception Sample",
      organization := "net.pikot",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2"
      // add other settings here
    )
  )
}
