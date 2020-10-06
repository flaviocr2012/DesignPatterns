package DesignPatterns.Factory;

public class BikeShowRoom {
    public static void main(String[] args) {
        String bikeName = "SportsBike";
        Bike bike = BikeFactory.createBike(bikeName);
        System.out.println("Bike is: " + bike.getDescription());
        System.out.println("Bike cost is: " + bike.getCost());

    }
}


