import sbt.Keys._
import sbt._

name := """scalaSamples"""

version := "1.0"

lazy val commonSettings = Seq(
	organization := "com.github.uryyyyyyy",
	scalaVersion := "2.11.7"
)


lazy val akkaVersion = "2.3.14"

lazy val akkaSettings = Seq(
	name := """akkaSample""",
	version := "1.0",
	libraryDependencies ++= Seq(
		"com.typesafe.akka" %% "akka-actor" % akkaVersion,
		"com.typesafe.akka" %% "akka-remote" % akkaVersion,
		"com.typesafe.akka" %% "akka-cluster" % akkaVersion,
		"com.typesafe.akka" %% "akka-contrib" % akkaVersion,
		"com.typesafe.akka" %% "akka-stream-experimental" % "2.0.1",
		"com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
		"org.scalatest" %% "scalatest" % "2.2.4" % "test"
	)
)

lazy val awsSDKSettings = Seq(
	name := """awsSdkSample""",
	version := "1.0",
	libraryDependencies ++= Seq(
		"com.amazonaws" % "aws-java-sdk" % "1.10.38"
	)
)

lazy val scalaz = (project in file("scalaz")).
	settings(commonSettings: _*)

lazy val aws = (project in file("aws"))
	.settings(commonSettings: _*)
	.settings(awsSDKSettings: _*)

lazy val scalikejdbc = (project in file("scalikejdbc")).
	settings(commonSettings: _*)

lazy val httpClient = (project in file("httpClient")).
	settings(commonSettings: _*)

lazy val scalajs = (project in file("scalajs")).
	settings(commonSettings: _*)

lazy val diPattern = (project in file("diPattern")).
	settings(commonSettings: _*)

lazy val play = (project in file("play")).
	settings(commonSettings: _*)

lazy val slick = (project in file("slick")).
	settings(commonSettings: _*)

lazy val scalaIO = (project in file("scalaIO")).
	settings(commonSettings: _*)

lazy val macroDefine = (project in file("macroDefine")).
	settings(commonSettings: _*)

lazy val macroUse = (project in file("macroUse"))
	.settings(commonSettings: _*)
	.dependsOn(macroDefine)

lazy val kuromoji = (project in file("kuromoji")).
	settings(commonSettings: _*)

lazy val googleAPI = (project in file("googleAPI")).
	settings(commonSettings: _*)

lazy val fp = (project in file("fp")).
	settings(commonSettings: _*)

lazy val nscalaTime = (project in file("nscalaTime")).
	settings(commonSettings: _*)

lazy val scopt = (project in file("scopt")).
	settings(commonSettings: _*)

lazy val poiScala = (project in file("poiScala")).
	settings(commonSettings: _*)

lazy val ficusSettings = Seq(
	name := """ficusSample""",
	version := "1.0",
	libraryDependencies ++= Seq(
		"net.ceedubs" %% "ficus" % "1.1.2"
	)
)

lazy val ficus = (project in file("ficus"))
	.settings(commonSettings: _*)
	.settings(ficusSettings: _*)

lazy val kamon = (project in file("kamon")).
	settings(commonSettings: _*)

lazy val future = (project in file("future")).
	settings(commonSettings: _*)

lazy val finagle = (project in file("finagle")).
	settings(commonSettings: _*)

lazy val gatling = (project in file("gatling")).
	settings(commonSettings: _*)

lazy val macwireSettings = Seq(
	name := """macwireSample""",
	version := "1.0",
	libraryDependencies ++= Seq(
		"com.softwaremill.macwire" % "macros_2.11" % "2.2.2"
	)
)

lazy val macwire = (project in file("macwire"))
	.settings(commonSettings: _*)
	.settings(macwireSettings: _*)

