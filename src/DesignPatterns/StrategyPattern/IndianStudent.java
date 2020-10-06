package DesignPatterns.StrategyPattern;

public class IndianStudent extends Student {

    public IndianStudent(String name) {
        super(name);
        socialNetwork = new Facebook();
    }

    @Override
    public void useSocialNetwork() {
        socialNetwork.useIt();
    }
}
