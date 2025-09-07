import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index beyond string length will throw exception
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException safely
    public static void handleException(String text) {
        try {
            System.out.println("Trying to access character at invalid index...");
            System.out.println("Character: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for the string
        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("\nStep 1: Generate StringIndexOutOfBoundsException (uncomment to see termination)");
        // generateException(input); // Uncomment to see program terminate

        System.out.println("\nStep 2: Handle StringIndexOutOfBoundsException safely");
        handleException(input);

        sc.close();
    }
}
