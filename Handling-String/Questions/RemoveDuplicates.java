import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicates
    public static String removeDuplicates(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (result.indexOf(ch) == -1) { // add only if not already present
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String modified = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + modified);

        sc.close();
    }
}
