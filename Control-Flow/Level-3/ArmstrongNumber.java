import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Store original number for comparison later
        int originalNumber = number;

        // Step 3: Initialize sum to 0
        int sum = 0;

        // Step 4: Loop until originalNumber becomes 0
        while (originalNumber != 0) {
            // Step 4.1: Extract the last digit
            int digit = originalNumber % 10;

            // Step 4.2: Cube the digit and add it to sum
            sum += digit * digit * digit;

            // Step 4.3: Remove the last digit (quotient)
            originalNumber = originalNumber / 10;
        }

        // Step 5: Compare sum with the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
