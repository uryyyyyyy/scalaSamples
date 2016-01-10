name := """akkaSample"""

version := "1.0"

scalaVersion := "2.11.7"

lazy val akkaVersion = "2.3.14"

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor" % akkaVersion,
	"com.typesafe.akka" %% "akka-remote" % akkaVersion,
	"com.typesafe.akka" %% "akka-cluster" % akkaVersion,
	"com.typesafe.akka" %% "akka-contrib" % akkaVersion,
	"com.typesafe.akka" %% "akka-stream-experimental" % "2.0.1",
	"com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
	"org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
