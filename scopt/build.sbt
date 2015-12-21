name := """scoptSample"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	"com.github.scopt" %% "scopt" % "3.3.0"
)

resolvers += Resolver.sonatypeRepo("public")