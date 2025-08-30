import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if(n < 1) {
            System.out.println(n + " is not a positive integer");
        } else {
            int factorial = 1;
            int i = 1;
            while(i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + factorial);
        }
        sc.close();
    }
}
