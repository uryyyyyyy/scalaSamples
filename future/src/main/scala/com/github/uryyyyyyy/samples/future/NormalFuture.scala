package com.github.uryyyyyyy.samples.future

import java.util.concurrent.TimeUnit

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration.Duration

object NormalFuture {

	def main(args: Array[String]): Unit = {

		val f = Future {
			TimeUnit.SECONDS.sleep(3)
			"Hello Future!!"
		}

		val result = Await.result(f, Duration.Inf)
		println(result)
		require(result == "Hello Future!!")
	}

}