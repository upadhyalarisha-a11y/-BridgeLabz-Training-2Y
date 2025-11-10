import java.util.Scanner;
public class MultiplesBelow100For {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int n = sc.nextInt();
        if(n < 1 || n >= 100){
            System.out.println("Invalid number");
        } else {
            for(int i = 100; i >= 1; i--){
                if(i % n == 0) System.out.println(i);
            }
        }
        sc.close();
    }
}
