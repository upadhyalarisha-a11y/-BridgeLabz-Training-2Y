import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = number;
        int sum = 0;

        // Step 2: Find sum of digits
        while (temp != 0) {
            int digit = temp % 10;  // get last digit
            sum += digit;           // add digit to sum
            temp /= 10;             // remove last digit
        }

        // Step 3: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }

        scanner.close();
    }
}
