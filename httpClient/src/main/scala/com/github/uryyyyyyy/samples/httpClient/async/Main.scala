package com.github.uryyyyyyy.samples.httpClient.async

import dispatch.Defaults._
import dispatch._

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object Main {
	def main(args: Array[String]) {
		val svc:dispatch.Req = url("http://www.ning.com/")
		val f:dispatch.Future[String] = Http(svc.OK(as.String))
		val res: String = Await.result(f, Duration.Inf)
		println(res)
	}

}