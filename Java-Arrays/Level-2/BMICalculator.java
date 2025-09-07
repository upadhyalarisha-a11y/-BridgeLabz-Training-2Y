import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step 2: Create arrays for weight, height, BMI, and status
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Step 3: Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");

            System.out.print("Enter weight in kg: ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();
        }

        // Step 4: Calculate BMI and weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step 5: Display results
        System.out.println("\nHeight(m)  Weight(kg)  BMI       Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f       %.2f       %.2f     %s\n", height[i], weight[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
