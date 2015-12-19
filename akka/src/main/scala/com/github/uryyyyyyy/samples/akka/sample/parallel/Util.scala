package com.github.uryyyyyyy.samples.akka.sample.parallel

object Util {

	def heavyMethod(i:Int) :String = {
		Thread.sleep(200)
		s"heavyMethod result. - $i"
	}

}