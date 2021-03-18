package com.app.textadv.repositories;

import com.app.textadv.entities.TextMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TextMessageRepository extends MongoRepository<TextMessage, String> {
    
}
