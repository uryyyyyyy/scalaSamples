name := """macroDefineSample"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	"org.scala-lang" % "scala-compiler" % scalaVersion.value,

	"org.scala-lang" % "scala-reflect" % scalaVersion.value
)
