package com.triggerbridge.demo

import com.triggerbridge.runtime.CoreRuntime
import com.triggerbridge.plugins.telegram.TelegramTrigger
import com.triggerbridge.Rule


fun main() {

    val runtime = CoreRuntime()

    runtime.addRule(
        Rule(
            event = "telegram.message",
            action = "termux"
        )
    )


    val telegram = TelegramTrigger()

    val event = telegram.receiveMessage(
        "activar termux"
    )


    runtime.emit(
        event.name
    )

}
