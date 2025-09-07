import java.util.Scanner;

public class SubstringCompare {

    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Step 2: Take input for start and end indices
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Invalid start or end index!");
            sc.close();
            return;
        }

        // Step 3: Create substring using charAt()
        String subCharAt = substringUsingCharAt(text, start, end);

        // Step 4: Create substring using built-in substring()
        String subBuiltIn = text.substring(start, end);

        // Step 5: Compare the substrings using charAt()
        boolean isEqual = compareUsingCharAt(subCharAt, subBuiltIn);

        // Step 6: Display results
        System.out.println("\nSubstring using charAt(): " + subCharAt);
        System.out.println("Substring using built-in substring(): " + subBuiltIn);
        System.out.println("Are both substrings equal? " + isEqual);

        sc.close();
    }
}
