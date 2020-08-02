package com.java.trmplate;

public class Tv extends Device {
    @Override
    public void deviceName() {
        System.out.println("tv");
    }

    @Override
    public void cost() {
        System.out.println("20000");
    }
}
