import java.util.Scanner;
public class SumOfNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n < 1) {
            System.out.println(n + " is not a natural number");
        } else {
            int sumFormula = n*(n+1)/2;
            int sumLoop = 0;
            for(int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumLoop);
        }
        sc.close();
    }
}
