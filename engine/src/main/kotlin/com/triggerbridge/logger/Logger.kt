package com.triggerbridge.logger

import java.time.LocalDateTime

object Logger {

    fun info(tag: String, message: String) {
        println("[INFO] ${LocalDateTime.now()} [$tag] $message")
    }

    fun warn(tag: String, message: String) {
        println("[WARN] ${LocalDateTime.now()} [$tag] $message")
    }

    fun error(tag: String, message: String) {
        println("[ERROR] ${LocalDateTime.now()} [$tag] $message")
    }
}
