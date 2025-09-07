import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count occurrences of substring
    public static int countOccurrences(String text, String sub) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // move index forward
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainText = sc.nextLine();

        System.out.print("Enter the substring to find: ");
        String substring = sc.nextLine();

        int occurrences = countOccurrences(mainText, substring);

        System.out.println("The substring occurs " + occurrences + " times.");

        sc.close();
    }
}
