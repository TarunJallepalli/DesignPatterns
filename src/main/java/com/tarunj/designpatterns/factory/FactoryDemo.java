package com.tarunj.designpatterns.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        String address = "Hyderabad";

        Logistics truckLogistics = new TruckLogistics();
        Logistics shipLogistics = new ShipLogistics();

        Transport landTransport = truckLogistics.createTransport();
        Transport seaTransport = shipLogistics.createTransport();

        landTransport.transport();
        landTransport.delivery(address);

        seaTransport.transport();
        seaTransport.delivery(address);

        Maintenance truckMaintenance = truckLogistics.createMaintenance();
        Maintenance shipMaintenance = shipLogistics.createMaintenance();

        truckMaintenance.doMaintenance();
        shipMaintenance.doMaintenance();
    }
}
