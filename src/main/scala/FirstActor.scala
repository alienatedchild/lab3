import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class FirstActor extends Actor {
  def receive: Receive = {
    case "hello" => println("hello back at you")
    case _       => println("huh?")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  // default Actor constructor
  val helloActor = system.actorOf(Props[FirstActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "buenos dias"
}
