package com.bnpp.epita.MQ;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MonConsumer {
    @JmsListener(destination = "queue_EPITA")
    public void consume(String message) {
        System.out.println("JE SUIS SPRING..."+message);
    }
}
