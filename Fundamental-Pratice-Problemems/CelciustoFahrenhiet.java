import java.util.*;
public class CelciustoFahrenhiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temprature in Celsius: ");
        float temp = sc.nextInt();
        float temp_f = (temp * 9/5) + 32;
        System.out.print("Temp in fahreheit is: "+ temp_f);
        sc.close();
    }
}
