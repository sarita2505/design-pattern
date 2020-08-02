package com.java.trmplate;

public class TempMain {
    public static void main(String[] args) {
        Device device=new Mobile();
        device.disp();
        Device device1=new Tv();
        device1.disp();
    }
}
