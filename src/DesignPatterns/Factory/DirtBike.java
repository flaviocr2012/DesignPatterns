package DesignPatterns.Factory;

public class DirtBike extends Bike {

    @Override
    public String getDescription() {
        return "DirtBike";
    }

    @Override
    public int getCost() {
        return 1000;
    }
}
