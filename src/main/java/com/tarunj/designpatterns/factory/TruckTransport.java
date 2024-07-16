package com.tarunj.designpatterns.factory;

public class TruckTransport implements Transport{
    @Override
    public void transport() {
        System.out.println("Transport via. Land Route");
    }

    @Override
    public void delivery(String address) {
        System.out.printf("Transporting on Truck to %s%n", address);
    }
}
