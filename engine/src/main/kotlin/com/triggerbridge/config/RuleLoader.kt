package com.triggerbridge.config

import com.triggerbridge.Rule
import java.io.File

class RuleLoader {

    fun load(path: String): List<Rule> {

        val file = File(path)

        if (!file.exists()) {
            println("Archivo de reglas no encontrado")
            return emptyList()
        }

        val rules = mutableListOf<Rule>()

        file.readLines().forEach { line ->

            if (line.contains("event")) {

                val event =
                    line.substringAfter(":")
                        .replace("\"", "")
                        .replace(",", "")
                        .trim()

                val actionLine =
                    file.readLines()
                        .firstOrNull {
                            it.contains("action")
                        }

                val action =
                    actionLine
                        ?.substringAfter(":")
                        ?.replace("\"", "")
                        ?.replace(",", "")
                        ?.trim()
                        ?: ""

                rules.add(
                    Rule(
                        event = event,
                        action = action
                    )
                )
            }
        }

        return rules
    }
}
