package training.udemyjava.polymorphism.compiletime;

public class MainCompileTime {

    public static void main(String[] args) {
        CompileTimeBinding calculator = new CompileTimeBinding();
        calculator.add(3, 5);
        calculator.add(4, 1, 5);
        calculator.add(3.14f, 3.14f);
    }
}
