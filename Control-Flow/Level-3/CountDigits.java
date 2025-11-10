import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0; // Step 2: Initialize counter

        // Step 3: Special case for number = 0
        if (number == 0) {
            count = 1;
        } else {
            // Step 4: Loop until number becomes 0
            while (number != 0) {
                number = number / 10;  // remove last digit
                count++;               // increase count
            }
        }

        // Step 5: Output result
        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}
