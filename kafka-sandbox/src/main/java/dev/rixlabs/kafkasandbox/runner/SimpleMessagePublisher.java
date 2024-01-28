package dev.rixlabs.kafkasandbox.runner;

import dev.rixlabs.kafkasandbox.producer.SingleMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleMessagePublisher implements CommandLineRunner {

    private final SingleMessageProducer singleMessageProducer;

    public SimpleMessagePublisher(SingleMessageProducer singleMessageProducer) {
        this.singleMessageProducer = singleMessageProducer;
    }

    @Override
    public void run(String... args) throws Exception {
        singleMessageProducer.sendMessage("Ciao Poldo");
    }
}
