package com.triggerbridge.core

interface Engine {

    fun start()

    fun stop()

    fun emit(event: String)

}
