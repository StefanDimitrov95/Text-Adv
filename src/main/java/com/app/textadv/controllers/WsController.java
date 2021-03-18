package com.app.textadv.controllers;

import com.app.textadv.entities.TextMessage;
import com.app.textadv.services.TextMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class WsController {

    private final TextMessageService messageService;

    @Autowired
    public WsController(TextMessageService messageService) {
        this.messageService = messageService;
    }

    @MessageMapping("/test")
    @SendTo("/chat")
    public TextMessage pong(TextMessage msg) {
        messageService.save(msg);
        return msg;
    }
}
