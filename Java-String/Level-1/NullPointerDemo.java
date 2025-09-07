public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException safely
    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Step 1: Generate NullPointerException (program will terminate if uncommented)");
        // generateException(); // Uncomment to see the program terminate due to exception

        System.out.println("\nStep 2: Handle NullPointerException safely");
        handleException();
    }
}
