package pl.stepwise

import akka.actor.ActorInitializationException
import akka.actor.OneForOneStrategy
import akka.actor.SupervisorStrategy
import java.time.Duration

fun main() {
    OneForOneStrategy(
            -1,
            Duration.ZERO,
            { t: Throwable ->
                when (t) {
                    is ActorInitializationException -> {
                        SupervisorStrategy.stop()   // WARNING HERE - "Requiring Directive got Any"
                    }
                    else -> {
                        SupervisorStrategy.resume() // WARNING HERE - "Requiring Directive got Any"
                    }
                }
            },
            false
    )
}