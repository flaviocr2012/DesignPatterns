package DesignPatterns.StrategyPattern;

public class ChineseStudent extends Student {

    public ChineseStudent(String name) {
        super(name);
        socialNetwork = new WeChat();
    }

    @Override
    public void useSocialNetwork() {
        socialNetwork.useIt();

    }
}
