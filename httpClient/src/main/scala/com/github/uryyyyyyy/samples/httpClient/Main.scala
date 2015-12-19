package com.github.uryyyyyyy.samples.httpClient

import play.api.libs.json.JsValue
import play.api.libs.ws.ning.NingWSClient

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Main {

	def getJson(url:String, client:NingWSClient):Future[Either[String, JsValue]] = {
		val res = client.url(url).withHeaders("Content-Type" -> "application/json").get()
		res.map(v => {
			v.status match{
				case 200 => Right(v.json)
				case _ => Left(v.body)
			}
		})
	}

	def postJson(url:String, client:NingWSClient, data:JsValue):Future[Either[String, JsValue]] = {
		val res = client.url(url).withHeaders("Content-Type" -> "application/json").post(data)
		res.map(v => {
			v.status match{
				case 200 => Right(v.json)
				case _ => Left(v.body)
			}
		})
	}

}