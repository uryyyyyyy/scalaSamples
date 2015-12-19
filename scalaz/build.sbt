name := """scalazSample"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	"org.scalaz" %% "scalaz-core" % "7.1.0"
)

scalacOptions in Test ++= Seq("-Yrangepos")