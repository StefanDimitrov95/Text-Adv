package com.app.textadv.services;

import com.app.textadv.entities.TextMessage;
import com.app.textadv.repositories.TextMessageRepository;
import org.springframework.stereotype.Service;

@Service
public class TextMessageService implements MessageService {

    private final TextMessageRepository messageRepository;

    public TextMessageService(TextMessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void save(TextMessage entity) {
        messageRepository.save(entity);
    }
}
