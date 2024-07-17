package com.tarunj.designpatterns.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SquarePegAdapter extends RoundPeg{

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return (Math.sqrt(Math.pow((squarePeg.getLength() / 2), 2) * 2));
    }
}
