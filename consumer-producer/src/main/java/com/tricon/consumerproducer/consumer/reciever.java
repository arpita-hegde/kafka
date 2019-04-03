package com.tricon.consumerproducer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class reciever {

    private static final Logger LOG = LoggerFactory.getLogger(reciever.class);

    @KafkaListener(topics = "${app.topic.foo}")
    public void listen(@Payload String message) {
        LOG.info("received message='{}'", message);
    }

}