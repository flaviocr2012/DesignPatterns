package DesignPatterns.StrategyPattern;

public class Main {
    public static void main(String[] args) {

        Student jamal = new IndianStudent("Jamal");
        System.out.println("Jamal uses: ");
        jamal.useSocialNetwork();

        Student danzag = new ChineseStudent("Danzag");
        System.out.println("Danzag uses: ");
        danzag.useSocialNetwork();

        danzag.setSocialNetwork(new Facebook());

        System.out.println("Danzag changed to: ");
        danzag.useSocialNetwork();

        Student dimitri = new RussianStudent("Dimitri");
        System.out.println("Dimitri uses: ");
        dimitri.useSocialNetwork();



    }
}
