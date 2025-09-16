import java.util.Scanner;

public class UnitConverter2 {

    // Conversion methods
    public static double convertYardsToFeet(double yards) {
        return yards * 3;   // 1 yard = 3 feet
    }

    public static double convertFeetToYards(double feet) {
        return feet / 3;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;  // 1 meter = 39.3701 inches
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;   // 1 inch = 0.0254 meters
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;     // 1 inch = 2.54 cm
    }

    public static double convertCmToInches(double cm) {
        return cm / 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in yards: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.print("Enter length in meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");

        System.out.print("Enter length in inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");

        System.out.print("Enter length in cm: ");
        double cm = sc.nextDouble();
        System.out.println(cm + " cm = " + convertCmToInches(cm) + " inches");

        sc.close();
    }
}
