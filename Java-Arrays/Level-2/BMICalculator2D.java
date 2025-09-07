import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Step 2: Create 2D array for height, weight, BMI
        // Column 0: weight, Column 1: height, Column 2: BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Step 3: Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            double weight;
            do {
                System.out.print("Enter weight in kg (positive value): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Try again.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            double height;
            do {
                System.out.print("Enter height in meters (positive value): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Try again.");
                }
            } while (height <= 0);
            personData[i][1] = height;

            // Step 4: Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Step 5: Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\nHeight(m)  Weight(kg)  BMI       Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f       %.2f       %.2f     %s\n",
                personData[i][1],  // height
                personData[i][0],  // weight
                personData[i][2],  // BMI
                weightStatus[i]    // status
            );
        }

        sc.close();
    }
}
