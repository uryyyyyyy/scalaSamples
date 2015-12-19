package com.github.uryyyyyyy.samples.httpClient
import scalaj.http._

object HttpClient {

	def get() {
		val response: HttpResponse[String] = Http("http://foo.com/search").param("q","monkeys").asString
		println(response.body)
		println(response.code)
		println(response.headers)
		println(response.cookies)
	}
}