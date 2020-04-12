package training.udemyjava.abstraction;

public abstract class HP implements TouchScreenLaptop {

    @Override
    public void scroll() {
        System.out.println("HP scrolling...!");
    }
}
