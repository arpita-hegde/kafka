package com.tricon.consumerproducer;

import com.tricon.consumerproducer.producer.sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerProducerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerProducerApplication.class, args);
    }

    @Autowired
    private sender sender;

    @Override
    public void run(String... strings) throws Exception {
        sender.send("Spring Kafka Producer and Consumer Example");
    }
}