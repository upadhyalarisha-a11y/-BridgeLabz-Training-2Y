@FunctionalInterface
interface ArithmeticOperation {
    int operate(int a, int b);
}

public class Test {
    public static void main(String[] args) {
        // Lambda expression implementing the interface
       
        ArithmeticOperation sub = (a, b) -> a - b;
       

        // Invoke (call) the methods
       
        System.out.println("Subtraction: " + sub.operate(10, 5));
       
    }
}
