import java.util.Scanner;
public class PowerFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int n = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();
        if(n < 1 || p < 0){
            System.out.println("Invalid input");
        } else {
            int result = 1;
            for(int i = 1; i <= p; i++){
                result *= n;
            }
            System.out.println(n + " raised to power " + p + " = " + result);
        }
        sc.close();
    }
}
