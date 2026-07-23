package com.triggerbridge.plugins

import com.triggerbridge.sdk.TriggerPlugin

class PluginManager {

    private val plugins = mutableMapOf<String, TriggerPlugin>()

    fun register(plugin: TriggerPlugin) {
        plugins[plugin.manifest.id] = plugin
        plugin.onLoad()
    }

    fun enable(id: String) {
        plugins[id]?.onEnable()
    }

    fun disable(id: String) {
        plugins[id]?.onDisable()
    }

    fun list(): List<String> {
        return plugins.keys.toList()
    }
}
