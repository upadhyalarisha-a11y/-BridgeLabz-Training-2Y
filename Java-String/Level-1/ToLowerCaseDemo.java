import java.util.Scanner;

public class ToLowerCaseDemo {

    // Method to convert text to lowercase using charAt() and ASCII values
    public static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // convert uppercase to lowercase
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

        // Step 2: Convert to lowercase using user-defined method
        String lowerCustom = convertToLower(input);

        // Step 3: Convert to lowercase using built-in method
        String lowerBuiltIn = input.toLowerCase();

        // Step 4: Compare the results
        boolean isEqual = compareStrings(lowerCustom, lowerBuiltIn);

        // Step 5: Display
        System.out.println("Lowercase using custom method: " + lowerCustom);
        System.out.println("Lowercase using built-in method: " + lowerBuiltIn);
        System.out.println("Are both lowercase conversions equal? " + isEqual);

        sc.close();
    }
}
