package com.github.uryyyyyyy.samples.di.guice
import com.google.inject._

object TestDISpec {

	def main (args: Array[String]) {
		val injector: Injector = Guice.createInjector(new ServiceModule)
		val user: ServiceUser = injector.getInstance(classOf[ServiceUser])
		user.use()
	}

}
