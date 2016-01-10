name := """httpClientSample"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	"org.scalaj" %% "scalaj-http" % "2.2.0",
	"com.typesafe.play" %% "play-ws" % "2.4.2",
	"com.typesafe.play" %% "play-json" % "2.4.2",
	"net.databinder.dispatch" % "dispatch-core_2.11" % "0.11.3"
)
