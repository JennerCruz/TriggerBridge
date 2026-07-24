package com.triggerbridge.actions

class ActionRegistry {

    private val actions = mutableMapOf<String, ActionHandler>()

    fun register(action: ActionHandler) {
        actions[action.name] = action
    }

    fun execute(name: String) {
        actions[name]?.execute()
            ?: println("Acción no encontrada: $name")
    }

    fun list(): List<String> {
        return actions.keys.toList()
    }
}
