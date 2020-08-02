package com.java.abs_fact;

public class Fish implements ISeeAnimal {
    @Override
    public IAnimal print() {
        ISeeAnimal animal=new Fish();
        animal.disp();
        return animal;
    }

    @Override
    public void disp() {
        System.out.println("fish class");
    }
}
