package com.java.abs_factory;

import com.java.factory.TypeF;
import com.java.rkp.factory.PlaneFactory;

public class AbsFactoryMain {
    public static void main(String[] args) {
        PlaneFactory planeFactory=new PlaneFactory();
       // planeFactory.getPlanType(TypeF.DOMASTIC);
        AbstractPlaneFactory.getPlaneFactory(Choice.TYPE);
    }
}
