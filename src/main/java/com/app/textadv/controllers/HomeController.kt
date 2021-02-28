package com.app.textadv.controllers

import com.app.textadv.entities.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("/")
    fun index(): Any {
        return Message( "John Doe", "Test");
    }

    @PostMapping("/")
    fun sendMessage(@RequestBody msg: Message): Message {
        return msg;
    }
}