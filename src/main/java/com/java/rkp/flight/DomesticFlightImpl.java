package com.java.rkp.flight;

import com.java.rkp.flight.IPlaneFlight;

public class DomesticFlightImpl implements IPlaneFlight {
    @Override
    public void disp() {
        System.out.println("this is domastic flight");
    }
}
