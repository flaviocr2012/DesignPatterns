package DesignPatterns.DecoratorPattern.CarExtensions;

public class BasicCar implements CarExtension {

    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public int getCost() {
        return 100000;
    }
}
