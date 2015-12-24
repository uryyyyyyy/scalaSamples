package com.github.uryyyyyyy.samples.kamon

import kamon.Kamon

object Main {

	def main(args: Array[String]): Unit = {
		Kamon.start()
		println("started")

		Thread.sleep(11000)
		val counter = new KamonCounter()
		counter.say()
		counter.say()
		counter.say()

		Thread.sleep(11000)

		// This application wont terminate unless you shutdown Kamon.
		Kamon.shutdown()
		println("finished")
	}

}
