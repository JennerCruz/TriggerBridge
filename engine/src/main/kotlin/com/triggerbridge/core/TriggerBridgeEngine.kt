package com.triggerbridge.core

import com.triggerbridge.Event
import com.triggerbridge.bus.EventBus
import com.triggerbridge.lifecycle.EngineState

class TriggerBridgeEngine : Engine {

    private var state = EngineState.STOPPED

    private val eventBus = EventBus()

    override fun start() {
        state = EngineState.RUNNING

        eventBus.subscribe { event ->
            println("Evento recibido: ${event.name}")
        }

        println("TriggerBridge iniciado")
    }

    override fun stop() {
        state = EngineState.STOPPED
        println("TriggerBridge detenido")
    }

    override fun emit(event: String) {

        eventBus.publish(
            Event(
                name = event,
                source = "engine"
            )
        )

    }

    fun status() = state
}
