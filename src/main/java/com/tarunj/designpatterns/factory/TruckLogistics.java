package com.tarunj.designpatterns.factory;

public class TruckLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new TruckTransport();
    }

    @Override
    public Maintenance createMaintenance() {
        return new TruckMaintenance();
    }
}
