package com.java.abs_factory;

import com.java.rkp.factory.PlaneFactory;

public class AbstractPlaneFactory {
    public static Object getPlaneFactory(Choice s) {
        switch (s) {
            case TYPE: {
                PlaneFactory factory = new PlaneFactory();
                //builder.getPlanType();
            }
            case PRICE: {
                PlaneFactory factory = new PlaneFactory();
               // builder.getPlanPrice();
            }

        } return null;
    }
}
