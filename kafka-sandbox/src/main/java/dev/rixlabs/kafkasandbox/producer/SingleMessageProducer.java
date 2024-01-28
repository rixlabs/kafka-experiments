package dev.rixlabs.kafkasandbox.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SingleMessageProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public SingleMessageProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send("rixlabs", message);
    }
}
