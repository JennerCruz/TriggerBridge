package com.triggerbridge.runtime

import com.triggerbridge.actions.ActionRegistry
import com.triggerbridge.actions.internal.TermuxAction
import com.triggerbridge.actions.internal.*
import com.triggerbridge.actions.ActionHandler
import com.triggerbridge.dispatcher.Dispatcher
import com.triggerbridge.Event
import com.triggerbridge.Rule

class CoreRuntime {

    private val registry = ActionRegistry()
    private val dispatcher: Dispatcher

    private val rules = mutableListOf<Rule>()

    init {

        registry.register(
            TermuxAction()
        )

        dispatcher = Dispatcher(registry)

    }


    fun addRule(rule: Rule) {
        rules.add(rule)
    }


    fun emit(name: String) {

        val event = Event(
            name = name,
            source = "runtime"
        )

        dispatcher.dispatch(
            event,
            rules
        )
    }


    fun actions(): List<String> {
        return registry.list()
    }
}
