import java.util.Scanner;

public class ReverseString {

    // Method to reverse a string
    public static String reverse(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take string input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 2: Reverse string using user-defined method
        String reversed = reverse(input);

        // Step 3: Display the result
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
