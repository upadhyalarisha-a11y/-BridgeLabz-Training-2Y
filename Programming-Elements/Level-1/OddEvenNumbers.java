import java.util.Scanner;
public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if(n < 1){
            System.out.println(n + " is not a natural number");
        } else {
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0) System.out.println(i + " is even");
                else System.out.println(i + " is odd");
            }
        }
        sc.close();
    }
}
