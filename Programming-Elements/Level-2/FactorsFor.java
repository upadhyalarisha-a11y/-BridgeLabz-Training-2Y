import java.util.Scanner;
public class FactorsFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        if(n < 1){
            System.out.println("Not a positive integer");
        } else {
            for(int i = 1; i < n; i++){
                if(n % i == 0) System.out.println(i);
            }
        }
        sc.close();
    }
}
