package com.triggerbridge.dispatcher

import com.triggerbridge.actions.ActionRegistry
import com.triggerbridge.Rule
import com.triggerbridge.Event

class Dispatcher(
    private val registry: ActionRegistry
) {

    fun dispatch(event: Event, rules: List<Rule>) {

        rules
            .filter { it.event == event.name }
            .forEach {
                registry.execute(it.action)
            }

    }
}
