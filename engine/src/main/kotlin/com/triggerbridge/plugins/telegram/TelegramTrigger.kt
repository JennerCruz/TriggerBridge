package com.triggerbridge.plugins.telegram

import com.triggerbridge.Event

class TelegramTrigger {

    fun receiveMessage(
        text: String
    ): Event {

        println("[TELEGRAM] Mensaje recibido: $text")

        return Event(
            name = "telegram.message",
            source = "telegram",
        )

    }

}
