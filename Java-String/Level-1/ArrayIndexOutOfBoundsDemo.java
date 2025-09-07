import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index beyond array length will throw exception
        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException safely
    public static void handleException(String[] names) {
        try {
            System.out.println("Trying to access invalid index...");
            System.out.println("Name: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught other RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of names
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.println("\nStep 1: Generate ArrayIndexOutOfBoundsException (uncomment to see termination)");
        // generateException(names); // Uncomment to see program terminate

        System.out.println("\nStep 2: Handle ArrayIndexOutOfBoundsException safely");
        handleException(names);

        sc.close();
    }
}
