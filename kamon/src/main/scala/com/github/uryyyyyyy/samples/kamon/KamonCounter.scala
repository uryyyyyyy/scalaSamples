package com.github.uryyyyyyy.samples.kamon

import kamon.Kamon
import kamon.annotation.{Count, EnableKamon}

@EnableKamon
class KamonCounter {

	@Count(name = "awesomeCounter")
	def say(): Unit = {
		println("hello")
	}

}
