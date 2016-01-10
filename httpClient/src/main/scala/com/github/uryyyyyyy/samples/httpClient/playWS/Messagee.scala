package com.github.uryyyyyyy.samples.httpClient.playWS

import play.api.libs.json.Json

case class Messagee(s:String, id:Int)

object Messagee {
	//these implicit serve convert(Json <-> ScalaObject)
	implicit val writes = Json.writes[Messagee]
	implicit val reads = Json.reads[Messagee]
}