package training.udemyjava.abstraction;

public class AbstractionMain {

    public static void main(String[] args) {
        TouchScreenLaptop touchScreenLaptop;

        touchScreenLaptop = new HPNotebook();
        touchScreenLaptop.scroll();
        touchScreenLaptop.click();

        touchScreenLaptop = new DellNotebook();
        touchScreenLaptop.scroll();
        touchScreenLaptop.click();
    }
}
