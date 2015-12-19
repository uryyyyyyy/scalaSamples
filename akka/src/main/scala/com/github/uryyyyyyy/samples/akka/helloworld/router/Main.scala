package com.github.uryyyyyyy.samples.akka.helloworld.router

import akka.actor.{ActorSystem, Props}
import akka.routing.{RoundRobinPool, RoundRobinRouter}

object Main {

	def main(args: Array[String]) :Unit = {
		val system = ActorSystem()
		val router = system.actorOf(RoundRobinPool(2).props(Props[MyActor]))
		(1 to 10).foreach(router ! _)
		Thread.sleep(6000)
		system.shutdown()
	}

}