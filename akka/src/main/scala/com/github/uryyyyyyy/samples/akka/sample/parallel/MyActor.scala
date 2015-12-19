package com.github.uryyyyyyy.samples.akka.sample.parallel

import akka.actor.Actor

class MyActor extends Actor {
	def receive = {
		case i:Int => {
			sender().tell(Util.heavyMethod(i), self)
		}
	}
}