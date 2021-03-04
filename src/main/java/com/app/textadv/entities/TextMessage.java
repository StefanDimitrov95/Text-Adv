package com.app.textadv.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

@Data
@AllArgsConstructor
public class TextMessage {
    private Long id;
    private Long senderId;
    private String senderName;
    private String body;
    private final String timestamp = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
}
