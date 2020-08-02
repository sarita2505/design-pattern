package com.java.abs_fact;

import com.java.abs_fact.factory.AnimalFactory;
import com.java.abs_fact.factory.FactoryEnumType;

public class MainClass {
    public static void main(String[] args) {
        AnimalFactory factory=new AnimalFactory();
        factory.getAnimal(FactoryEnumType.LANDANIMALFACTORY,AnimalEnum.LION);
    }
}
