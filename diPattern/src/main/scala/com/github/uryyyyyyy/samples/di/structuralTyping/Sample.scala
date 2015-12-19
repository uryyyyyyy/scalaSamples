package com.github.uryyyyyyy.samples.di.structuralTyping

trait MyService {
	def process: String
}
trait MyDao {
	def echo: String
}

class MyServiceImpl(env : { val warmer: MyService2 }) extends MyService {
	def process = "aaa"
}
class MyDaoImpl extends MyDao {
	def echo = "aa"
}

class MyService2(env: {val potSensor: MyDao}) {
	def trigger = env.potSensor.echo
}

class MyController(env : { val warmer: MyService2 }) {
	def action() = println(env.warmer.trigger)
}

