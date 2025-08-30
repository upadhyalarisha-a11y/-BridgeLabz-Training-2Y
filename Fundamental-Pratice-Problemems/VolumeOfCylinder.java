import java.util.*;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        double r=sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double h=sc.nextDouble();
        double volume = 3.14 * r*r*h;
        System.out.printf("Volume of cyliner is: %.2f",volume);
        sc.close();
    }
}