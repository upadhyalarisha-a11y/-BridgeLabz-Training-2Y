import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter a number between 6 and 9: ");
        int number = sc.nextInt();

        
        int[] multiplicationResult = new int[10]; 

      
        if (number >= 6 && number <= 9) {
      
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = number * i;
            }

          
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
            }
        } else {
            System.out.println("Please enter a number between 6 and 9 only.");
        }

        sc.close();
    }
}
