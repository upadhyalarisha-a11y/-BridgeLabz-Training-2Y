import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take number input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 3: Extract digits and store in array
        int tempNumber = number; // preserve original number
        while (tempNumber != 0 && index < maxDigit) {
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
            index++;
        }

        // Step 4: Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Step 5: Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 6: Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
