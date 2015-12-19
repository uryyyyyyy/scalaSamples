package com.github.uryyyyyyy.samples.akka.sample.sequential

import akka.actor.Actor

class MyActor extends Actor {
	def receive = {
		case i:Int => {
			MyCounter.add(i)
		}
	}
}