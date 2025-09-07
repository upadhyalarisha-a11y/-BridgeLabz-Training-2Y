import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Step 2: Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural (positive) number.");
            sc.close();
            return;
        }

        // Step 3: Create a String array to save results
        String[] results = new String[number + 1]; // +1 since we start from 0

        // Step 4: Loop from 0 to number and save results
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Step 5: Display results with index positions
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        sc.close();
    }
}
