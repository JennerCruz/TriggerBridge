package com.triggerbridge

class Dispatcher {

    fun dispatch(event: Event, rules: List<Rule>) {

        rules.filter { it.event == event.name }
            .forEach {
                println("Evento: ${event.name}")
                println("Acción: ${it.action}")
            }

    }

}
