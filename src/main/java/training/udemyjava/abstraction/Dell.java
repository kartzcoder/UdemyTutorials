package training.udemyjava.abstraction;

public abstract class Dell implements TouchScreenLaptop {

    @Override
    public void scroll() {
        System.out.println("Dell scrolling...!");
    }
}
