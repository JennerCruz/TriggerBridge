package com.triggerbridge.actions.internal

import com.triggerbridge.actions.ActionHandler

class TermuxAction : ActionHandler {

    override val name = "termux"

    override fun execute() {
        println("[TERMUX] Acción ejecutada correctamente.")
    }

}
