import java.util.Random;

public class FootballTeamHeights {

    // Method to find sum of all elements
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];

        // Generate random heights between 150 and 250 inclusive
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // 0 to 100 + 150 = 150 to 250
        }

        // Display all heights
        System.out.println("Player heights (in cms):");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        // Display results
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.printf("Mean height: %.2f cm\n", mean);
    }
}
