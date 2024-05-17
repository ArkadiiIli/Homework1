package homework2.task1;

public class Sedan extends Car {
    @Override
    int getNumberOfDoors() {
        return 5;
    }

    @Override
    int getTrunkCapacity() {
        return 100;
    }

    @Override
    public void start() {
        System.out.println("The sedan started moving");
    }

    @Override
    public void stop() {
        System.out.println("The sedan stopped");
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    public String getLuxuryLevel() {
        return "S-class";
    }
}
