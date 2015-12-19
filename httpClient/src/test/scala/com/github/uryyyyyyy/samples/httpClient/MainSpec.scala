package com.github.uryyyyyyy.samples.httpClient

import com.ning.http.client.AsyncHttpClientConfig
import play.api.libs.json.Json
import play.api.libs.ws.ning.{NingAsyncHttpClientConfigBuilder, NingWSClient, NingWSClientConfig}

import scala.concurrent.Await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration

object MainSpec {

	def main(args: Array[String]): Unit ={
		val config = new NingAsyncHttpClientConfigBuilder(NingWSClientConfig()).build()
		val builder = new AsyncHttpClientConfig.Builder(config)
		val client = new NingWSClient(builder.build)

		val url = "http://qiita.com/api/v2/tags?page=1&per_page=10"
		val res = Main.getJson(url, client).map(_.right.map(println))
		Await.result(res, Duration.Inf)

		val m = Messagee("hello", 10)
		val res2 = Main.postJson(url, client, Json.toJson(m)).map(_.left.map(println))
		Await.result(res2, Duration.Inf)
		client.close()
	}

}
