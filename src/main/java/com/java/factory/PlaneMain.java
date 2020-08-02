package com.java.factory;

public class PlaneMain {
    public static void main(String[] args) {
        PlaneTypeFactory.getPlanByName(TypeF.COMMERCIAL);
        PlaneTypeFactory.getPlanByName(TypeF.DOMASTIC);
    }
}
