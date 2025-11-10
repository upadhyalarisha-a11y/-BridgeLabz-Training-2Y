import java.util.Scanner;
public class YoungestTallestFriends {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ages of Amar, Akbar, Anthony: ");
        int ageA = sc.nextInt(), ageB = sc.nextInt(), ageC = sc.nextInt();
        int youngest = Math.min(ageA, Math.min(ageB, ageC));
        System.out.println("Youngest age: " + youngest);

        System.out.print("Enter heights of Amar, Akbar, Anthony: ");
        int hA = sc.nextInt(), hB = sc.nextInt(), hC = sc.nextInt();
        int tallest = Math.max(hA, Math.max(hB, hC));
        System.out.println("Tallest height: " + tallest);
        sc.close();
    }
}
