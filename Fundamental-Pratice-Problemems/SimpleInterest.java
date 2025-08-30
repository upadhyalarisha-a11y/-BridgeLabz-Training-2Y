import java.util.*;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, rate and time: ");
        int p=sc.nextInt();
        float r = sc.nextFloat();
        int t=sc.nextInt();
        float simpleInterest = (p*r*t)/100;
        System.out.println("Simple interest is : "+simpleInterest);
        sc.close();
    }
}