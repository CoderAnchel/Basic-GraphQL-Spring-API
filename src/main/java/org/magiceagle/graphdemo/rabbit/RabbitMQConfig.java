package org.magiceagle.graphdemo.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    public static final String QUEUE_NAME = "hello";

    @Bean
    public Queue helloQueue() {
        return new Queue(QUEUE_NAME, false);
    }
}