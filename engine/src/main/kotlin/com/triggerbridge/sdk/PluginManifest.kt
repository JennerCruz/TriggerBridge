package com.triggerbridge.sdk

data class PluginManifest(
    val id: String,
    val name: String,
    val version: String,
    val author: String,
    val permissions: List<String>
)
