import java.util.*;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle: ");
        float l=sc.nextFloat();
        float w=sc.nextFloat();
        float perimeter = 2*(l+w);
        System.out.println("Perimeter of rectangle is: " + perimeter);
        sc.close();
    }
}
