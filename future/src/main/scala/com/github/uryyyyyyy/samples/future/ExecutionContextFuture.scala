package com.github.uryyyyyyy.samples.future

import java.util.concurrent.{Executors, TimeUnit}

import scala.concurrent._
import scala.concurrent.duration.Duration

object ExecutionContextFuture {

	def main(args: Array[String]): Unit = {

		val es = Executors.newCachedThreadPool
		implicit val context = ExecutionContext.fromExecutorService(es)

		val f = Future {
			TimeUnit.SECONDS.sleep(3)
			"Hello Future!!"
		}

		val result = Await.result(f, Duration.Inf)
		println(result)
		require(result == "Hello Future!!")

		es.shutdown()
		es.awaitTermination(5, TimeUnit.SECONDS)
	}

}