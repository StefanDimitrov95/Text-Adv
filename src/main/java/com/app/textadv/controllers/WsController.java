package com.app.textadv.controllers;

import com.app.textadv.entities.TextMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WsController {

    @MessageMapping("/test")
    @SendTo("/chat")
    public TextMessage pong(String text) {
        return new TextMessage(1L, 1L, "Test", text);
    }
}
