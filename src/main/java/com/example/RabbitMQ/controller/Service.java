package com.example.RabbitMQ.controller;

import com.example.RabbitMQ.publisher.Publisher;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Publisher publisher;

    public void sendMessage(String message){
        System.out.println("Se va a mandar mensaje..." + message);
        MyData myData = new MyData(1,message);
        publisher.sendMessage(myData);
    }

}
