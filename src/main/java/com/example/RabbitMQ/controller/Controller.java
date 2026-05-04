package com.example.RabbitMQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class Controller {

    @Autowired
    private Service service;

    @GetMapping
    public void testSendMessage(){
        String message = "Mensaje de prueba!";
        System.out.println("Mandando mensaje..." + message);
        service.sendMessage(message);
    }
}
