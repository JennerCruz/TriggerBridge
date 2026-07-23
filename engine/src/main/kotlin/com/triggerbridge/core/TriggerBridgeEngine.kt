package com.triggerbridge.core

import com.triggerbridge.bootstrap.Bootstrap
import com.triggerbridge.lifecycle.EngineState

class TriggerBridgeEngine : Engine {

    private var state = EngineState.STOPPED
    private val bootstrap = Bootstrap()

    override fun start() {
        state = EngineState.STARTING

        bootstrap.initialize()

        state = EngineState.RUNNING

        println("TriggerBridge iniciado.")
    }

    override fun stop() {
        state = EngineState.STOPPED
        println("TriggerBridge detenido.")
    }

    override fun emit(event: String) {
        println("Evento: $event")
    }

    fun status() = state
}
