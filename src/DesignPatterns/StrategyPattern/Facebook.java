package DesignPatterns.StrategyPattern;

public class Facebook implements SocialNetwork {
    @Override
    public void useIt() {
        System.out.println("Facebook");
    }
}
