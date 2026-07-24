package com.triggerbridge.bus

import com.triggerbridge.Event

class EventBus {

    private val listeners = mutableListOf<(Event) -> Unit>()

    fun subscribe(listener: (Event) -> Unit) {
        listeners.add(listener)
    }

    fun publish(event: Event) {
        listeners.forEach { listener ->
            listener(event)
        }
    }
}
