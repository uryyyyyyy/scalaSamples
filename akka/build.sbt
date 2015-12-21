name := """akkaSample"""

version := "1.0"

scalaVersion := "2.11.7"

lazy val akkaVersion = "2.4.1"

libraryDependencies ++= Seq(
//	"com.typesafe.akka" %% "akka-actor" % akkaVersion,
//	"com.typesafe.akka" %% "akka-remote" % akkaVersion,
//	"com.typesafe.akka" %% "akka-cluster" % akkaVersion,
//	"com.typesafe.akka" %% "akka-contrib" % akkaVersion,
//	"com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
	"org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
