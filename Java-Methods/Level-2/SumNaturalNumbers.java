import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    // Formula method
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
        } else {
            int recursiveSum = sumRecursive(n);
            int formulaSum = sumFormula(n);

            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (recursiveSum == formulaSum) {
                System.out.println("Both methods give the same result ✅");
            } else {
                System.out.println("Mismatch ❌");
            }
        }

        sc.close();
    }
}
