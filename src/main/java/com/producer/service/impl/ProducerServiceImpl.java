package com.producer.service.impl;

import com.producer.model.Message;
import com.producer.service.ProducerService;
import com.producer.util.JsonUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private JmsTemplate jmsTemplate;



    @Override
    public Mono<Message> sendMessage(Message message) {
     jmsTemplate.convertAndSend("topic-test", JsonUtility.toJson(message));
        return Mono.just(message);
    }
}
