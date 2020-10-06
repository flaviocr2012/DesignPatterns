package DesignPatterns.DecoratorPattern.CarExtensions;

public class RearCamera implements CarExtension {
    CarExtension carExtension;

    public RearCamera(CarExtension carExtension) {
        this.carExtension = carExtension;
    }


    @Override
    public String getDescription() {
        return carExtension.getDescription() + ", Rear Camera ";
    }

    @Override
    public int getCost() {
        return carExtension.getCost ()+ 40;
    }
}
