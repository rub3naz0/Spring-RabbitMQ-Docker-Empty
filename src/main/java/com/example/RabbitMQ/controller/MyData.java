package com.example.RabbitMQ.controller;

import java.io.Serializable;

public class MyData implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private String message;

    public MyData(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public MyData() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Data{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
