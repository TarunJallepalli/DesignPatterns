package com.tarunj.designpatterns.factory;

public class TruckMaintenance implements Maintenance{

    @Override
    public void doMaintenance() {
        System.out.println("Cleaning the Truck");
    }
}
