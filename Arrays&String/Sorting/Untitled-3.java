// Defining a class
class Car {

    // Properties (variables)
    String color;
    String model;

    // Behavior (method)
    void drive() {
        System.out.println(model + " in " + color + " color is driving...");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Creating first object
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "Honda City";

        // Creating second object
        Car car2 = new Car();
        car2.color = "Blue";
        car2.model = "BMW X3";

        // Calling methods
        car1.drive();
        car2.drive();
    }
}
