package com.java.rkp.flight;

import com.java.rkp.flight.IPlaneFlight;

public class CommercialFlightImpl implements IPlaneFlight {
    @Override
    public void disp() {
        System.out.println("this is commercial plan");
    }
}
