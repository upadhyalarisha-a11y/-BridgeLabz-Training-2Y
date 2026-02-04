@FunctionalInterface
interface Calculator {
    int add(int a, int b);

    default int multiply(int a, int b) {
        return a * b
}

public class Calculator {
    public static void main(String[] args) {
        Calculator c = (a, b) -> a + b;
        System.out.println("Result: " + c.add(5, 3));
        System.out.println("Multiplication Result: " + c.multiply(5, 3));
    }
}
