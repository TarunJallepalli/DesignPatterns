package com.tarunj.designpatterns.factory;

public class ShipTransport implements Transport{
    @Override
    public void transport() {
        System.out.println("Transport via. Sea Route");
    }

    @Override
    public void delivery(String address) {
        System.out.printf("Transporting on Ship to %s%n", address);
    }
}
