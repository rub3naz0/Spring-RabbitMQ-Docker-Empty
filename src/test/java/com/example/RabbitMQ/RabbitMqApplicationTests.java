package com.example.RabbitMQ;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "spring.rabbitmq.host=localhost",
        "spring.rabbitmq.port=5672",
        "spring.rabbitmq.username=guest",
        "spring.rabbitmq.password=guest",
        "example.queue.name=cola1"
        // Añade aquí cualquier otra variable ${...} que esté fallando
})
class RabbitMqApplicationTests {
    @Test
    void contextLoads() {
    }
}
