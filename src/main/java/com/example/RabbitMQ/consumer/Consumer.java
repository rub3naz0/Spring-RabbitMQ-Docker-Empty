package com.example.RabbitMQ.consumer;

import com.example.RabbitMQ.controller.MyData;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class Consumer {

    @RabbitListener(queues = {"${example.queue.name}"})
    public void receive(@Payload MyData message){
        System.out.println("Recibido mensaje..."+ message);
        makeSlow();
    }

    private void makeSlow(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
