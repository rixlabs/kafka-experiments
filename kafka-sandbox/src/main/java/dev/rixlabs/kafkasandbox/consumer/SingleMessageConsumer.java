package dev.rixlabs.kafkasandbox.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SingleMessageConsumer {

    @KafkaListener(topics = "rixlabs", id = "rixlabs")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
