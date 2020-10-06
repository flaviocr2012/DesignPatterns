package DesignPatterns.DecoratorPattern.CarExtensions;

public class MusicSystem implements CarExtension {
    CarExtension carExtension;

    public MusicSystem(CarExtension carExtension) {
        this.carExtension = carExtension;
    }

    @Override
    public String getDescription() {
        return carExtension.getDescription() + ", MusicSystem";
    }

    @Override
    public int getCost() {
        return carExtension.getCost()+ 70;
    }
}
