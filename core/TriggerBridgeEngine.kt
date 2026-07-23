package com.triggerbridge.core

class TriggerBridgeEngine:Engine{

    override fun start() {
        println("Engine iniciado")
    }

    override fun stop() {
        println("Engine detenido")
    }

    override fun emit(event:String) {
        println("Evento: $event")
    }

}
