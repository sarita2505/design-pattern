package com.java.abs_fact.factory;

import com.java.abs_fact.*;

public class LandAnimalFactory {
    public IAnimal getAnimalByNmae(AnimalEnum name){
        switch(name){
            case LION:
                Lion lion=new Lion();
                lion.print();
                return lion;
            case TIGER:
                Tiger tiger=new Tiger();
                tiger.print();
                return tiger;
        }
        return null;
    }
}
