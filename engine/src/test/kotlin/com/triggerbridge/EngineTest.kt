package com.triggerbridge

import com.triggerbridge.core.TriggerBridgeEngine
import kotlin.test.Test
import kotlin.test.assertNotNull

class EngineTest {

    @Test
    fun engineStarts() {

        val engine = TriggerBridgeEngine()

        engine.start()

        assertNotNull(engine.status())

        engine.stop()
    }
}
