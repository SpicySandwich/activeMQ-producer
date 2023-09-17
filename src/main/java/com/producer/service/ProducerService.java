package com.producer.service;

import com.producer.model.Message;
import reactor.core.publisher.Mono;

public interface ProducerService {

    Mono<Message> sendMessage(Message message);
}
