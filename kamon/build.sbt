import com.typesafe.sbt.SbtAspectj._

name := """kamonSample"""

version := "1.0"

scalaVersion := "2.11.7"

val kamonVersion = "0.5.2"

libraryDependencies ++= Seq(
	"io.kamon" %% "kamon-core" % kamonVersion,
	"io.kamon" %% "kamon-akka" % kamonVersion,
	"io.kamon" %% "kamon-spray" % kamonVersion,
	"io.kamon" %% "kamon-annotation" % kamonVersion,
	"io.kamon" %% "kamon-log-reporter" % kamonVersion,
	"com.typesafe.akka" %% "akka-slf4j" % "2.3.14"
)

aspectjSettings

// Here we are effectively adding the `-javaagent` JVM startup
// option with the location of the AspectJ Weaver provided by
// the sbt-aspectj plugin.
javaOptions in run <++= AspectjKeys.weaverOptions in Aspectj

// We need to ensure that the JVM is forked for the
// AspectJ Weaver to kick in properly and do it's magic.
fork in run := true
