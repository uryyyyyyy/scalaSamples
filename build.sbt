name := """scalaSamples"""

version := "1.0"

lazy val commonSettings = Seq(
	organization := "com.github.uryyyyyyy",
	scalaVersion := "2.11.7"
)

lazy val specs2 = (project in file("specs2")).
		settings(commonSettings: _*)

lazy val scalaz = (project in file("scalaz")).
		settings(commonSettings: _*)

lazy val aws = (project in file("aws")).
		settings(commonSettings: _*)

lazy val scalikejdbc = (project in file("scalikejdbc")).
		settings(commonSettings: _*)

lazy val akka = (project in file("akka")).
		settings(commonSettings: _*)

lazy val httpClient = (project in file("httpClient")).
		settings(commonSettings: _*)

lazy val mail = (project in file("mail")).
		settings(commonSettings: _*)

lazy val scalaTest = (project in file("scalaTest")).
		settings(commonSettings: _*)

lazy val scalajs = (project in file("scalajs")).
		settings(commonSettings: _*)

lazy val diPattern = (project in file("diPattern")).
		settings(commonSettings: _*)

lazy val play = (project in file("play")).
		settings(commonSettings: _*)

lazy val slick = (project in file("slick")).
		settings(commonSettings: _*)

lazy val javaAWT = (project in file("javaAWT")).
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
