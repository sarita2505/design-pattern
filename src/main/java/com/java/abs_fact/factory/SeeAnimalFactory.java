package com.java.abs_fact.factory;

import com.java.abs_fact.*;

public class SeeAnimalFactory {
    public IAnimal getAnimalByNmae(AnimalEnum name){
        switch(name){
            case FISH:
                Fish fish=new Fish();
                fish.print();
                return fish;
            case TIMI:
                Timi timi=new Timi();
                timi.print();
                return timi;
        }
        return null;
    }
}
