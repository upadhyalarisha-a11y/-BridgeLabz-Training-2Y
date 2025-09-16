import java.util.*;

public class TriangularParkRun {
    
    // Method to calculate number of rounds
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c; // in meters
        double distance = 5000; // 5 km = 5000 meters
        return (int)Math.ceil(distance / perimeter); // rounds (rounded up)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the three sides of the triangular park (in meters): ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km run.");
        
        sc.close();
    }
}
