package training.udemyjava.polymorphism.compiletime;

public class CompileTimeBinding {

    //demoing method overloading

    public void add(int a, int b) {
        System.out.println("result: " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("result: " + (a + b + c));
    }

    public void add(float a, float b) {
        System.out.println("result: " + (a + b));
    }
}
