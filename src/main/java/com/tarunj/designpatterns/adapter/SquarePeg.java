package com.tarunj.designpatterns.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SquarePeg {

    private double length;

    public SquarePeg(double length) {
        this.length = length;
    }
}
