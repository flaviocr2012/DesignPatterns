package DesignPatterns.StrategyPattern;

public class WeChat implements SocialNetwork {
    @Override
    public void useIt() {
        System.out.println("WeChat");
    }
}
