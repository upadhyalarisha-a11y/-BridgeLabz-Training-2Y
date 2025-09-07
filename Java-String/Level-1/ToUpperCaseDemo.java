import java.util.Scanner;

public class ToUpperCaseDemo {

    // Method to convert text to uppercase using charAt() and ASCII values
    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // convert lowercase to uppercase
            }
            result += ch;
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take complete text input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Step 2: Convert to uppercase using user-defined method
        String upperCustom = convertToUpper(input);

        // Step 3: Convert to uppercase using built-in method
        String upperBuiltIn = input.toUpperCase();

        // Step 4: Compare the results
        boolean isEqual = compareStrings(upperCustom, upperBuiltIn);

        // Step 5: Display
        System.out.println("Uppercase using custom method: " + upperCustom);
        System.out.println("Uppercase using built-in method: " + upperBuiltIn);
        System.out.println("Are both uppercase conversions equal? " + isEqual);

        sc.close();
    }
}
