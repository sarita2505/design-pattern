package com.java.abs_factory;

import com.java.rkp.flight.IPlaneFlight;

public interface IFlightBuilder {
    IPlaneFlight getPlanType(Type type);
    PlanePrice getPlanPrice(Price price);
}
