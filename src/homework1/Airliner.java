package homework1;

import java.util.Random;

public class Airliner extends Transport implements Fly {
    static {
        System.out.println("First " + Airliner.class.getName() + " created!");
    }

    private final double fuelLevel;

    private final String name;

    {
        fuelLevel = new Random().nextDouble() * 1000;
    }

    public Airliner(String name, double maxSpeed) {
        super(maxSpeed, Transport.FuelType.JET_FUEL);
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(getTransportName() + " is flying");
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
