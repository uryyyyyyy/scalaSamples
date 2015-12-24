name := """kamonSample"""

version := "1.0"

scalaVersion := "2.11.7"

val kamonVersion = "0.5.2"

libraryDependencies ++= Seq(
	"io.kamon" %% "kamon-core" % kamonVersion,
	"io.kamon" %% "kamon-akka" % kamonVersion
)
