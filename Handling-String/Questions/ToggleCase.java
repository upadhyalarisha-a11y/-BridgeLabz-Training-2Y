import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of each character
    public static String toggleCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32); // convert uppercase to lowercase
            } else if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32); // convert lowercase to uppercase
            } else {
                result += ch; // non-alphabetic characters remain the same
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String toggled = toggleCase(input);

        System.out.println("Toggled case string: " + toggled);

        sc.close();
    }
}
