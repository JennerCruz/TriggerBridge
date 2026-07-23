package com.triggerbridge

fun main() {

    val engine = TriggerBridge()

    engine.addRule(
        Rule(
            event = "telegram.message",
            action = "termux"
        )
    )

    engine.emit(
        Event(
            name = "telegram.message",
            source = "telegram"
        )
    )

}
