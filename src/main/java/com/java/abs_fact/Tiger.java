package com.java.abs_fact;

public class Tiger implements ILandAnimal {
    @Override
    public IAnimal print() {
        IAnimal animal=new Tiger();
         animal.disp();
         return animal;
    }

    @Override
    public void disp() {
        System.out.println("tiger class");
    }
}
