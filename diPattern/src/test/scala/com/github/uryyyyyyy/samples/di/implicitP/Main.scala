package com.github.uryyyyyyy.samples.di.implicitP

object Main {

	def main(args: Array[String]) {
		implicit val potSensor = new MyDaoImpl
		implicit val heater = new MyServiceImpl
		val controller = new MyController()
		controller.action()
	}

}