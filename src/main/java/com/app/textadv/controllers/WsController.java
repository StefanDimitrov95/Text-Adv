package com.app.textadv.controllers;

import com.app.textadv.entities.TextMessage;
import com.app.textadv.repositories.TextMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WsController {

    @Autowired
    TextMessageRepository repo;

    @MessageMapping("/test")
    @SendTo("/chat")
    public TextMessage pong(TextMessage msg) {
        repo.save(msg);
        return msg;
    }
}
