package com.java.trmplate;

public class Mobile extends Device {
    @Override
    public void deviceName() {
        System.out.println("mobile");
    }

    @Override
    public void cost() {
        System.out.println("15000");

    }
}
