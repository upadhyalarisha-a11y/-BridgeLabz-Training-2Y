public class Circle {
    private double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // calls parameterized constructor with default value
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Circle paramCircle = new Circle(5.0);
        System.out.println("Parameterized Circle:");
        paramCircle.displayDetails();
    }
}
