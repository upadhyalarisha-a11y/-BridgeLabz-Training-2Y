@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class Calculator {
    public static void main(String[] args) {
        Calculator c = (a, b) -> a + b;
        System.out.println("Result: " + c.add(5, 3));
    }
}
