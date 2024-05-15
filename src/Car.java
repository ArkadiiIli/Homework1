import java.util.Random;

public class Car extends Transport implements Move {
    static {
        System.out.println("First " + Car.class.getName() + " created!");
    }

    private final double fuelLevel;

    private final String name;

    {
        fuelLevel = new Random().nextDouble() * 100;
    }

    public Car(String name, double maxSpeed) {
        super(maxSpeed, FuelType.GASOLINE);
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(getTransportName() + " is moving");
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