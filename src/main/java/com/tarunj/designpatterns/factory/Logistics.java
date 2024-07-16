package com.tarunj.designpatterns.factory;

public abstract class Logistics {

    public void planDeliver(String address) {

        System.out.printf("Delivery Planned to address %s%n",address);
    }

    public abstract Transport createTransport();

    public abstract Maintenance createMaintenance();
}
