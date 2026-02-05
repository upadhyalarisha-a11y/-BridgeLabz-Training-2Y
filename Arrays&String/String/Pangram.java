package Strings;

public class Pangram{

    public static boolean isPangram(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;

        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (!seen[ch - 'a']) {
                    seen[ch - 'a'] = true;
                    count++;
                }
            }
        }
        return count == 26;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(s)); // true
    }
}