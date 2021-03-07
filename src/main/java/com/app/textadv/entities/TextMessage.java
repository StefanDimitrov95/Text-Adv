package com.app.textadv.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

@Document
@Data
@AllArgsConstructor
public class TextMessage {
    @MongoId
    private String id;
    private Long senderId;
    private String senderName;
    private String body;
    private String timestamp;

    public TextMessage() {
        this.timestamp = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
    }
}

