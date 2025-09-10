import java.util.Scanner;

public class BMICalculator {

    // Method to compute BMI and status
    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;  // convert cm → meters
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // return array with formatted strings
        return new String[] {
            String.format("%.2f", weight),
            String.format("%.2f", heightCm),
            String.format("%.2f", bmi),
            status
        };
    }

    // Method to calculate BMI for all persons
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[data.length][4]; // weight, height, bmi, status
        for (int i = 0; i < data.length; i++) {
            results[i] = computeBMI(data[i][0], data[i][1]);
        }
        return results;
    }

    // Method to display results in tabular form
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("----------------------------------------------------------");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2]; // [10 persons][weight, height]

        // Input data
        System.out.println("Enter weight (kg) and height (cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        String[][] results = calculateBMI(data);

        // Display results
        System.out.println("\nBMI Report:");
        displayResults(results);

        sc.close();
    }
}
