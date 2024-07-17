package com.tarunj.designpatterns.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoundPeg {

    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

}
