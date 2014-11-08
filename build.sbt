name := """scalaSamples"""

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.1.6" % "test",
	"com.amazonaws" % "aws-java-sdk" % "1.6.8",
	"org.scalatest" %% "scalatest" % "2.1.6" % "test",
	"org.scalaz" %% "scalaz-core" % "7.1.0",
	"com.typesafe.akka" %% "akka-actor" % "2.3.4"
)
