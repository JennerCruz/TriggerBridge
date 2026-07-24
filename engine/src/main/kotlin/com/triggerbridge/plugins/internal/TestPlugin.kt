package com.triggerbridge.plugins.internal

import com.triggerbridge.Event

class TestPlugin {

    fun emitTestEvent(): Event {

        return Event(
            name = "telegram.message",
            source = "test-plugin"
        )

    }

}
