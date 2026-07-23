package com.triggerbridge

class TriggerBridge {

    private val rules = mutableListOf<Rule>()
    private val dispatcher = Dispatcher()

    fun addRule(rule: Rule) {
        rules.add(rule)
    }

    fun emit(event: Event) {
        dispatcher.dispatch(event, rules)
    }
}
