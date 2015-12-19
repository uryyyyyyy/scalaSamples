package com.github.uryyyyyyy.samples.akka.java.helloworld.pingpong;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

public class ParentActor extends UntypedActor {

	@Override
	public void onReceive(Object message) throws Exception {
		if (message instanceof String) {
			System.out.println("ping received. " + message);
		} else if (message instanceof Long) {
			System.out.println("start ping. " + message);
			ActorRef echoActorRef = getContext().actorOf(Props.create(ChildActor.class), "childActor");
			echoActorRef.tell("mm", getSelf());
		} else {
			System.out.println("Got unknown type message.");
			unhandled(message);
		}
	}
}
