import java.util.Scanner;

public class CountVowelsConsonants {

    // Method to count vowels in a string
    public static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase(); // convert to lowercase for easier comparison
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // Method to count consonants in a string
    public static int countConsonants(String text) {
        int count = 0;
        text = text.toLowerCase(); // convert to lowercase for easier comparison
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if ((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take string input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 2: Count vowels and consonants using methods
        int vowels = countVowels(input);
        int consonants = countConsonants(input);

        // Step 3: Display results
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        sc.close();
    }
}
