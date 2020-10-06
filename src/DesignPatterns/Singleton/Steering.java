package DesignPatterns.Singleton;

public class Steering {
    private String size;
    private volatile static Steering uniqueInstance;

    private Steering() {
        size = "Big";
    }

    public static Steering getUniqueInstance() {
        if (uniqueInstance == null){
            synchronized (Steering.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Steering();
                }
            }
        }

        return uniqueInstance;
    }
}
