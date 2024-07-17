package com.tarunj.designpatterns.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5.0d);
        RoundPeg roundPeg = new RoundPeg(6.0d);

        if(hole.fits(roundPeg)) {
            System.out.println("Hole fits the Round Peg!!!");
        } else {
            System.out.println("Hole Doesn't Fit Round Peg!!!");
        }

        SquarePeg smallSquare = new SquarePeg(2);
        SquarePeg largeSquare = new SquarePeg(10);

        RoundPeg smallSquarePeg = new SquarePegAdapter(smallSquare);
        RoundPeg largeSquarePeg = new SquarePegAdapter(largeSquare);

        if(hole.fits(smallSquarePeg)) {
            System.out.println("Hole fits the Small Square Peg!!!");
        } else {
            System.out.println("Hole Doesn't Fit Small Square Peg!!!");
        }

        if(hole.fits(largeSquarePeg)) {
            System.out.println("Hole fits the Large Square Peg!!!");
        } else {
            System.out.println("Hole Doesn't Fit Large Square Peg!!!");
        }
    }
}
