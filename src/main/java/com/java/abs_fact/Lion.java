package com.java.abs_fact;

public class Lion implements ILandAnimal {
    @Override
    public IAnimal print() {
        IAnimal animal=new Lion();
        animal.disp();
        return animal;
    }

    @Override
    public void disp() {
        System.out.println("lion class");
    }
}
