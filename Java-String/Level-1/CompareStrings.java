import java.util.Scanner;

public class CompareStrings {

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

        // Step 1: Take input for two strings
        System.out.print("Enter first string: ");
        String string1 = sc.next();

        System.out.print("Enter second string: ");
        String string2 = sc.next();

        // Step 2: Compare using charAt()
        boolean charAtResult = compareUsingCharAt(string1, string2);

        // Step 3: Compare using built-in equals() method
        boolean equalsResult = string1.equals(string2);

        // Step 4: Display results
        System.out.println("\nComparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);

        // Step 5: Check if results are the same
        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results differ between methods.");
        }

        sc.close();
    }
}
