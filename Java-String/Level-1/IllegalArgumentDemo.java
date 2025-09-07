import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Start index > end index will throw IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException safely
    public static void handleException(String text) {
        try {
            System.out.println("Trying to get substring with start index > end index...");
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught other RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for the string
        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("\nStep 1: Generate IllegalArgumentException (uncomment to see termination)");
        // generateException(input); // Uncomment to see program terminate

        System.out.println("\nStep 2: Handle IllegalArgumentException safely");
        handleException(input);

        sc.close();
    }
}
