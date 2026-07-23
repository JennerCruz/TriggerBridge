package com.triggerbridge

data class Event(
    val name: String,
    val source: String,
    val payload: Map<String, String> = emptyMap()
)
