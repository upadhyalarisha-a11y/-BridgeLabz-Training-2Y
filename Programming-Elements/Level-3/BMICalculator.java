import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = scanner.nextDouble();

        // Step 2: Convert cm to meters
        double heightM = heightCm / 100;

        // Step 3: Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Step 4: Display BMI
        System.out.println("Your BMI is: " + bmi);

        // Step 5: Determine category
        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You are Normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }

        scanner.close();
    }
}
