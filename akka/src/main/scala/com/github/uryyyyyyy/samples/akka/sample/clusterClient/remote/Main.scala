package com.github.uryyyyyyy.samples.akka.sample.clusterClient.remote

import akka.actor.{ActorSystem, Props}
import akka.contrib.pattern.ClusterReceptionistExtension
import com.typesafe.config.ConfigFactory

object Main {

	def main(args: Array[String]) :Unit = {
		if(args.length == 0) {
			println("set cluster port num")
			return
		}

		val config = ConfigFactory.parseString("akka.remote.netty.tcp.port=" + args(0))
			.withFallback(ConfigFactory.load("sample_clusterRemote_application"))

		val system = ActorSystem("myCluster", config)
		val actor = system.actorOf(Props[RemoteActor], name="remote")
		ClusterReceptionistExtension(system).registerService(actor)
		println(actor.path.toStringWithoutAddress)
		println("Remote is ready")
	}
}