package server

import akka.actor.{Actor, ActorLogging, Props}

object GraphQLActor {
  def props: Props = Props[GraphQLActor]
}

class GraphQLActor extends Actor with ActorLogging {
  override def receive: Receive = {
    case other => sender() ! other
  }
}