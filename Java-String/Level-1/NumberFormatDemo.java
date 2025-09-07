import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not numeric
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException safely
    public static void handleException(String text) {
        try {
            System.out.println("Trying to parse text to number...");
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught other RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input as String
        System.out.print("Enter a string to convert to number: ");
        String input = sc.next();

        System.out.println("\nStep 1: Generate NumberFormatException (uncomment to see termination)");
        // generateException(input); // Uncomment to see program terminate if input is not numeric

        System.out.println("\nStep 2: Handle NumberFormatException safely");
        handleException(input);

        sc.close();
    }
}
