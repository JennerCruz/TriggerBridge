package com.triggerbridge.plugins.loader

import java.io.File

data class PluginInfo(
    val name: String,
    val path: String
)

class PluginLoader {

    fun load(directory: String): List<PluginInfo> {

        val folder = File(directory)

        if (!folder.exists()) {
            return emptyList()
        }

        return folder.listFiles()
            ?.filter { it.isDirectory() }
            ?.map {
                PluginInfo(
                    name = it.name,
                    path = it.absolutePath
                )
            }
            ?: emptyList()
    }
}
