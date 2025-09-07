import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0;

        // Take input from user
        System.out.println("Enter the heights of 11 players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i]; // add to sum
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Print result
        System.out.println("Mean height of the football team = " + mean + " cm");

        sc.close();
    }
}
