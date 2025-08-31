public class DayOfWeek {
    public static void main(String[] args) {
        // Ensure that three command-line arguments are passed
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Step 1: Parse inputs
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Step 2: Apply Zeller’s Congruence
        // If month is Jan or Feb, treat them as months 13 and 14 of previous year
        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;      // Year of the century
        int j = y / 100;      // Zero-based century

        // Formula
        int h = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // h = 0 -> Saturday, 1 -> Sunday, 2 -> Monday ... 6 -> Friday
        // We need 0 = Sunday, 1 = Monday ... 6 = Saturday
        int dayOfWeek = (h + 6) % 7;

        // Step 3: Print result
        System.out.println(dayOfWeek);
    }
}
