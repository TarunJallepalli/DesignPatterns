package com.tarunj.designpatterns.factory;

public class ShipLogistics extends Logistics{

    @Override
    public Transport createTransport() {
        return new ShipTransport();
    }

    @Override
    public Maintenance createMaintenance() {
        return new ShipMaintenance();
    }
}
