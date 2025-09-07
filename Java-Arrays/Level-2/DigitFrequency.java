import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();  // Use long to handle large numbers

        // Step 2: Count digits
        long temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Step 3: Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Step 4: Create frequency array
        int[] frequency = new int[10]; // Index 0 to 9

        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;  // Increment count of each digit
        }

        // Step 5: Display frequency
        System.out.println("\nDigit  Frequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("  " + i + "      " + frequency[i]);
            }
        }

        sc.close();
    }
}
