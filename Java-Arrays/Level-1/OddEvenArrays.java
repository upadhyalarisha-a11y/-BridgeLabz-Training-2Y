import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Step 2: Check for natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return; // exit program
        }

        // Step 3: Create arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];

        // Step 4: Index trackers
        int evenIndex = 0;
        int oddIndex = 0;

        // Step 5: Loop through numbers from 1 to number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        // Step 6: Print odd numbers
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        // Step 7: Print even numbers
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
    }
}
