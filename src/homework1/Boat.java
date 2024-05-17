package homework1;

import java.util.Random;

public class Boat extends Transport implements Sail {
    static {
        System.out.println("First " + Boat.class.getName() + " created!");
    }

    private final double fuelLevel;

    private final String name;

    {
        fuelLevel = new Random().nextDouble() * 10000;
    }

    public Boat(String name, double maxSpeed) {
        super(maxSpeed, Transport.FuelType.DIESEL);
        this.name = name;
    }

    @Override
    public void sail() {
        System.out.println(getTransportName() + " is sailing");
    }

    @Override
    public void checkFuelLevel() {
        System.out.println("Level of " + getFuelType().getDisplayName() + " " + fuelLevel);

    }

    @Override
    String getTransportName() {
        return name;
    }
}
