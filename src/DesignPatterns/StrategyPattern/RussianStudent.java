package DesignPatterns.StrategyPattern;

public class RussianStudent extends Student {

    public RussianStudent(String name) {
        super(name);
        socialNetwork = new VK();
    }

    @Override
    public void useSocialNetwork() {
        socialNetwork.useIt();

    }
}
