name := """kuromojiSample"""

version := "1.0"

scalaVersion := "2.11.7"

lazy val luceneVersion = "5.3.1"

libraryDependencies ++= Seq(
	"com.atilika.kuromoji" % "kuromoji-ipadic" % "0.9.0",
	"org.apache.lucene"    %  "lucene-core"               % luceneVersion,
	"org.apache.lucene"    %  "lucene-analyzers-common"   % luceneVersion,
	"org.apache.lucene"    %  "lucene-analyzers-kuromoji" % luceneVersion,
	"org.apache.lucene"    %  "lucene-suggest"            % luceneVersion,
	"org.scalatest" %% "scalatest" % "2.2.5" % "test"
)
