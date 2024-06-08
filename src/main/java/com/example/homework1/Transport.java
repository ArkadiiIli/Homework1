package com.example.homework1;

public abstract class Transport {
    private final double maxSpeed;
    private final FuelType fuelType;

    public Transport(double maxSpeed, FuelType fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public abstract void checkFuelLevel();

    public void moveWithMaxSpeed() {
        String stringBuilder = getTransportName() +
                " reaches a maximum speed of " +
                maxSpeed +
                "km/h";
        System.out.println(stringBuilder);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    abstract String getTransportName();

    public enum FuelType {

        DIESEL("Diesel"),
        GASOLINE("Gasoline"),
        JET_FUEL("Jet Fuel");

        private final String displayName;

        FuelType(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }
}
