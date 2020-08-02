package com.java.abs_fact.factory;

import com.java.abs_fact.AnimalEnum;
import com.java.abs_fact.IAnimal;

public class AnimalFactory {
    public IAnimal getAnimal(FactoryEnumType factoryEnumType, AnimalEnum name) {
        switch (factoryEnumType) {
            case LANDANIMALFACTORY:
                LandAnimalFactory factory = new LandAnimalFactory();
                return factory.getAnimalByNmae(name);
                case SEEANIMALFACTORY:
                SeeAnimalFactory seeAnimalFactory = new SeeAnimalFactory();
                return seeAnimalFactory.getAnimalByNmae(name);
        }return null;
    }
}
