package com.github.uryyyyyyy.samples.di.structualTyping

import com.github.uryyyyyyy.samples.di.structuralTyping.{MyController, MyDaoImpl, MyService2}

object Main {

	def main(args: Array[String]) {
		object Config {
			lazy val potSensor = new MyDaoImpl
			lazy val warmer = new MyService2(this) // this is where injection happens
		}
		val controller = new MyController(Config)
		controller.action()
	}

}
