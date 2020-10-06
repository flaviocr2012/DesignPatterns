package DesignPatterns.Factory;

public class WaterDrowningBike extends Bike {
    @Override
    public String getDescription() {
        return "Water Drowning Bike";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
