package com.tarunj.designpatterns.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return radius <= roundPeg.getRadius();
    }
}
