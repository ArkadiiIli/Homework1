package com.example.homework1;

public class Main {
    public static void main(String[] args) {
        Car kia = new Car("Kia Rio", 188);
        Transport bulkCarrier = new Boat("Bulk Carrier", 27.8);
        Fly boeing = new Airliner("Boeing 747", 988);
        kia.moveWithMaxSpeed();
        kia.checkFuelLevel();
        kia.move();
        bulkCarrier.moveWithMaxSpeed();
        bulkCarrier.checkFuelLevel();
        boeing.fly();
        Airliner airbus = new Airliner("Airbus A380", 1185);
        airbus.moveWithMaxSpeed();
        airbus.checkFuelLevel();
        airbus.fly();
        Airliner airliner = (Airliner) boeing;
        airliner.checkFuelLevel();
    }
}