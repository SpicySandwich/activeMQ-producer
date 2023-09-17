package com.producer.controller;

import com.producer.model.Message;
import com.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/")
public class SendMessageController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("send-message")
    public Mono<Message> sendMessage(@RequestBody Message message){
      return  producerService.sendMessage(message);
    }
}
