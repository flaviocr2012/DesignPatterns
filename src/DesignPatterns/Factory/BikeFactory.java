package DesignPatterns.Factory;

public class BikeFactory {
    public static Bike createBike (String bikeName){
        Bike bike = null;

        if (bikeName.equalsIgnoreCase("DirtyBike")) {
            bike = new DirtBike();
        }else if (bikeName.equalsIgnoreCase("SkyFKyingBike")) {
            bike = new SkyFlyingBike();
        }else if (bikeName.equalsIgnoreCase("SportsBike")) {
            bike = new SportsBike();
        }else if (bikeName.equalsIgnoreCase("WaterDrowningBike")){
            bike = new WaterDrowningBike();
        }

        return bike;
    }
}
