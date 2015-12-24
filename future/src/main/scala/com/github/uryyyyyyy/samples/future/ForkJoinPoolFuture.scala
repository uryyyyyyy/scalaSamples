package com.github.uryyyyyyy.samples.future

import scala.concurrent._
import scala.concurrent.duration.Duration
import java.util.concurrent.{ForkJoinPool, TimeUnit}

object NormalFuture {

	def main(args: Array[String]): Unit = {

		val pool = new ForkJoinPool
    implicit val context = ExecutionContext.fromExecutorService(pool)

    val f = future {
      TimeUnit.SECONDS.sleep(3)
      "Hello Future!!"
    }

    val result = Await.result(f, Duration.Inf)
    println(result)
    require(result == "Hello Future!!")
	}

}
