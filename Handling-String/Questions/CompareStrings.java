import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        return s1.length() - s2.length(); // if all characters are same, compare lengths
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" lexicographically.");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" lexicographically.");
        } else {
            System.out.println("Both strings are equal.");
        }

        sc.close();
    }
}

