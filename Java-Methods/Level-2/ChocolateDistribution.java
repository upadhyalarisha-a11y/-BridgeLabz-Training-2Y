import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find quotient and remainder for chocolate division
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[] {each, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        if (children == 0) {
            System.out.println("Cannot divide among zero children!");
        } else {
            int[] result = findRemainderAndQuotient(chocolates, children);
            System.out.println("Each child gets: " + result[0]);
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
