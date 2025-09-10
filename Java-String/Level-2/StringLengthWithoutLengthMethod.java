import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {  
                str.charAt(count);  // will throw exception when index is out of range
                count++;
            }
        } catch (Exception e) {
            // Exception indicates we've reached the end of the string
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();   // read a single word input

        // Using user-defined method
        int customLength = findLength(input);

        // Using built-in length()
        int builtinLength = input.length();

        System.out.println("Length (User-defined method): " + customLength);
        System.out.println("Length (Built-in method): " + builtinLength);

        sc.close();
    }
}
