package com.java.abs_fact;

public class Timi implements ISeeAnimal {
    @Override
    public IAnimal print() {
        IAnimal animal=new Timi();
        animal.disp();
        return animal;
    }

    @Override
    public void disp() {
        System.out.println("timi class");
    }
}
