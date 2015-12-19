package com.github.uryyyyyyy.samples.di.cake

object Main {

	def main(args: Array[String]) {

		object ComponentRegistry extends
		MyServiceComponentImpl with
		MyDaoComponentImpl with
		MyControllerComponentImpl {
			val onOff = new MyServiceImpl
			val sensor = new MyDaoImpl
			val warmer = new MyController
		}

		val controller = ComponentRegistry.warmer
		controller.action
	}

}
