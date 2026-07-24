package com.triggerbridge.demo

import com.triggerbridge.Event
import com.triggerbridge.Rule
import com.triggerbridge.actions.ActionRegistry
import com.triggerbridge.actions.internal.TermuxAction
import com.triggerbridge.dispatcher.Dispatcher

fun main() {

    val registry = ActionRegistry()

    registry.register(
        TermuxAction()
    )

    val dispatcher = Dispatcher(registry)

    val rules = listOf(
        Rule(
            event = "telegram.message",
            action = "termux"
        )
    )

    val event = Event(
        name = "telegram.message",
        source = "test-plugin"
    )

    dispatcher.dispatch(
        event,
        rules
    )
}
