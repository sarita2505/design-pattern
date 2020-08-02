package com.java.factory;

public class PlaneTypeFactory {
    public static Object getPlanByName(TypeF type) {
        switch (type) {
            case DOMASTIC: {
                Domastic domastic=new Domastic();
                domastic.disp();
                return domastic;
            }
            case COMMERCIAL:{
                Commercial commercial=new Commercial();
                commercial.disp();
            }
        }return null;
    }
}
