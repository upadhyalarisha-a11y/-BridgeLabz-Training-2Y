package Strings;

public class ValidIPAddress {

    public static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");

        if (parts.length != 4) return false;

        for (String part : parts) {
            if (part.length() == 0) return false;

            // Leading zero check
            if (part.length() > 1 && part.charAt(0) == '0') return false;

            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ip = "192.168.1.1";
        System.out.println(isValidIP(ip)); // true
    }
}