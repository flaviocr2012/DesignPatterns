package DesignPatterns.Factory;

public class SkyFlyingBike extends Bike {
    @Override
    public String getDescription() {
        return "Sky Flying Bike";
    }

    @Override
    public int getCost() {
        return 5000;
    }
}
