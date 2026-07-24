package com.triggerbridge.rules

import com.triggerbridge.Rule
import com.triggerbridge.Event

class RuleEngine {

    private val rules = mutableListOf<Rule>()

    fun add(rule: Rule) {
        rules.add(rule)
    }

    fun match(event: Event): List<Rule> {

        return rules.filter {
            it.event == event.name
        }

    }

}
