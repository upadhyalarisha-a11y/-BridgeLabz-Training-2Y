import java.util.Scanner;

public class Factorial {

    // Method to calculate factorial
    public static long findFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = findFactorial(num);
            System.out.println("Factorial of " + num + " = " + result);
        }

        sc.close();
    }
}
