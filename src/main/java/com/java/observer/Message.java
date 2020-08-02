package com.java.observer;

public class Message {
    String msz;

    public Message(String msz) {
        this.msz = msz;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msz='" + msz + '\'' +
                '}';
    }
}
