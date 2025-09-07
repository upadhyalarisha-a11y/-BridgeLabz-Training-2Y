import java.util.Scanner;

public class MostFrequentChar {

    // Method to find the most frequent character
    public static char mostFrequentChar(String text) {
        int[] freq = new int[256]; // ASCII character frequency array

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > max) {
                max = freq[text.charAt(i)];
                result = text.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char frequentChar = mostFrequentChar(input);

        System.out.println("Most Frequent Character: '" + frequentChar + "'");

        sc.close();
    }
}
