package com.github.uryyyyyyy.samples.di.implicitP

class MyController(implicit val service: MyService) {
	def action() = println(service.process())
}

