package homework2.task1;

public class Truck extends Car {
    @Override
    int getNumberOfDoors() {
        return 3;
    }

    @Override
    int getTrunkCapacity() {
        return 1000;
    }

    @Override
    public void start() {
        System.out.println("The truck started moving");
    }

    @Override
    public void stop() {
        System.out.println("The truck stopped");
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public int getMaxLoadCapacity() {
        return 10000;
    }
}
