package com.java.rkp.factory;


import com.java.abs_factory.*;
import com.java.rkp.flight.CommercialFlightImpl;
import com.java.rkp.flight.DomesticFlightImpl;
import com.java.rkp.flight.IPlaneFlight;

public class PlaneFactory  {

    public PlanePrice getPlanPrice(Price price) {
        return null;
    }


    public IPlaneFlight getPlanType(Type type) {
        IPlaneFlight planeType=null;
        switch (type) {
            case DOMASTIC: {
                planeType=new DomesticFlightImpl();
                planeType.disp();
                return planeType;
            }
            case COMMERCIAL:{
                planeType=new CommercialFlightImpl();
                planeType.disp();
                return planeType;
            }
        }return null;
    }

}
