package com.github.uryyyyyyy.samples.akka.java.helloworld.schedule;

import java.util.concurrent.TimeUnit;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import scala.concurrent.duration.Duration;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ActorSystem system = ActorSystem.create("EchoSystem");
		ActorRef echoActorRef = system.actorOf(Props.create(EchoActor.class), "EchoActor");
		echoActorRef.tell("Hello world", ActorRef.noSender());
		echoActorRef.tell(10, ActorRef.noSender());
		system.scheduler().schedule(
				Duration.Zero(),
				Duration.create(100, TimeUnit.MILLISECONDS),
				echoActorRef,
				"hello",
				system.dispatcher(),
				ActorRef.noSender()
		);
		Thread.sleep(10000);
		system.stop(echoActorRef);
		system.shutdown();
	}
}
