package com.app.textadv.entities

import java.time.Instant
import java.time.format.DateTimeFormatter

data class Message(
    val senderName: String,
    val body: String,
) {
    val timestamp: String = DateTimeFormatter.ISO_INSTANT.format(Instant.now())
}