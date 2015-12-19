package com.github.uryyyyyyy.samples.akka.java.helloworld.args;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ActorSystem system = ActorSystem.create("EchoSystem");
		ActorRef echoActorRef = system.actorOf(Props.create(EchoActor.class, "hello", 10), "EchoActor");
		echoActorRef.tell("Hello world", ActorRef.noSender());
		echoActorRef.tell(10, ActorRef.noSender());
		Thread.sleep(1000);
		system.stop(echoActorRef);
		system.shutdown();
	}
}
