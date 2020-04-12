package training.udemyjava.polymorphism.runtime;

import sun.applet.Main;

public class MainRunTime extends Bike{

    @Override
    public String sound() {
        return "my bike.... wrooom...!";
    }

    public static void main(String[] args) {
        MainRunTime obj = new MainRunTime();
        System.out.println(obj.sound());
    }
}
