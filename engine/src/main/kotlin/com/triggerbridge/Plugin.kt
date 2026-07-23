package com.triggerbridge

interface Plugin {
    val id: String
    fun initialize()
}
