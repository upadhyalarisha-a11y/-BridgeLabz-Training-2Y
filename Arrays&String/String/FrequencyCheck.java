package Strings;

import java.util.HashMap;

public class FrequencyCheck {

    public static void frequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            System.out.println(ch + " -> " + map.get(ch));
        }
    }

    public static void main(String[] args) {
        String s = "programming";
        frequency(s);
    }
}