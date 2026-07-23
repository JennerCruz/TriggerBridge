package com.triggerbridge.sdk

interface TriggerPlugin {

    val manifest: PluginManifest

    fun onLoad()

    fun onEnable()

    fun onDisable()

}
