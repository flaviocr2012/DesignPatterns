package DesignPatterns.Factory;

public class SportsBike extends Bike {
    @Override
    public String getDescription() {
        return "Sports Bike";
    }

    @Override
    public int getCost() {
        return 660;
    }
}
