name := """spraySample"""

version := "1.0"

scalaVersion := "2.11.7"

val sprayVersion = "1.3.3"

libraryDependencies ++= Seq(
	"io.spray" %% "spray-http" % sprayVersion,
	"io.spray" %% "spray-routing" % sprayVersion,
	"io.spray" %% "spray-can" % sprayVersion,
	"com.typesafe.akka" %% "akka-actor" % "2.3.14",
	"io.spray" %% "spray-testkit" % sprayVersion % "test"
)
