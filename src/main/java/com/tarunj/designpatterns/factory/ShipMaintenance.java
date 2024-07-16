package com.tarunj.designpatterns.factory;

public class ShipMaintenance implements Maintenance{
    @Override
    public void doMaintenance() {
        System.out.println("Cleaning the Ship");
    }
}
