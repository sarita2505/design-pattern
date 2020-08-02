package com.java.trmplate;

public abstract class Device {
    protected abstract void deviceName();
    protected abstract void cost();
    public void disp(){
        deviceName();
        cost();
    }
}
