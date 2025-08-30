import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = (a+b+c)/3;
        System.out.println("Average of three numbers is: "+avg);
        sc.close();
    }
}