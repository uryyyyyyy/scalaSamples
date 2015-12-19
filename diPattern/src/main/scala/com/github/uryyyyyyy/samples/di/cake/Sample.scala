package com.github.uryyyyyyy.samples.di.cake

trait MyServiceComponent {
	val onOff: MyService
	trait MyService {
		def process: String
	}
}
trait MyDaoComponent {
	val sensor: MyDao
	trait MyDao {
		def echo: String
	}
}

trait MyServiceComponentImpl extends MyServiceComponent {
	this: MyDaoComponent =>
	class MyServiceImpl extends MyService {
		def process = sensor.echo
	}
}
trait MyDaoComponentImpl extends MyDaoComponent {
	class MyDaoImpl extends MyDao {
		def echo = "daoImpl"
	}
}

trait MyControllerComponentImpl {
	this: MyServiceComponent =>
	class MyController {
		def action = {
			println(onOff.process)
		}
	}
}