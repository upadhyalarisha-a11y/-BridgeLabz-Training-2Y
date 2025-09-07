import java.util.Scanner;

public class StringToCharArrayDemo {

    // Method to return characters in string without using toCharArray()
    public static char[] getChars(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Step 2: Call user-defined method
        char[] chars1 = getChars(text);

        // Step 3: Call built-in method
        char[] chars2 = text.toCharArray();

        // Step 4: Compare arrays
        boolean result = compareCharArrays(chars1, chars2);

        // Step 5: Display results
        System.out.println("Characters using user-defined method: " + java.util.Arrays.toString(chars1));
        System.out.println("Characters using toCharArray(): " + java.util.Arrays.toString(chars2));
        System.out.println("Are both results same? " + result);

        sc.close();
    }
}
