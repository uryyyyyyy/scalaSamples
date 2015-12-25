name := """gatlingSample"""

enablePlugins(GatlingPlugin)

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	"io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.7",
	"io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.7" % "test",
	"io.gatling"            % "gatling-test-framework"    % "2.1.7" % "test"
)
