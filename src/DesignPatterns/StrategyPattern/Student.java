package DesignPatterns.StrategyPattern;

public abstract class Student {

    protected String Name;
    protected SocialNetwork socialNetwork;

    public Student(String name) {
        Name = name;
    }

    public abstract void useSocialNetwork();

    public void setSocialNetwork(SocialNetwork socialNetwork){
        this.socialNetwork = socialNetwork;
    }

}
