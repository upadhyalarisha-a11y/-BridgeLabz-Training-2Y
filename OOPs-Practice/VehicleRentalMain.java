// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private double rentalPrice;

    // Constructor
    public Vehicle(String vehicleId, String brand, double rentalPrice) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentalPrice = rentalPrice;
    }

    // Getters & Setters
    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getRentalPrice() { return rentalPrice; }
    public void setRentalPrice(double rentalPrice) { this.rentalPrice = rentalPrice; }

    // Abstract method
    public abstract double calculateRental(int days);

    // Concrete method
    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Brand: " + brand + ", Rental Price per Day: " + rentalPrice);
    }
}

// Insurable interface
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable {
    public Car(String vehicleId, String brand, double rentalPrice) {
        super(vehicleId, brand, rentalPrice);
    }

    @Override
    public double calculateRental(int days) {
        return getRentalPrice() * days; // Simple per day cost
    }

    @Override
    public double calculateInsurance() {
        return getRentalPrice() * 0.10; // 10% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: 10% of rental price";
    }
}

// Bike class
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleId, String brand, double rentalPrice) {
        super(vehicleId, brand, rentalPrice);
    }

    @Override
    public double calculateRental(int days) {
        return getRentalPrice() * days * 0.9; // 10% discount for bikes
    }

    @Override
    public double calculateInsurance() {
        return getRentalPrice() * 0.05; // 5% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: 5% of rental price";
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleId, String brand, double rentalPrice) {
        super(vehicleId, brand, rentalPrice);
    }

    @Override
    public double calculateRental(int days) {
        return getRentalPrice() * days + 500; // Extra fixed cost
    }

    @Override
    public double calculateInsurance() {
        return getRentalPrice() * 0.15; // 15% insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: 15% of rental price";
    }
}

// Main class
public class VehicleRentalMain {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("C101", "Toyota", 2000);
        vehicles[1] = new Bike("B202", "Yamaha", 800);
        vehicles[2] = new Truck("T303", "Tata", 5000);

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            v.displayDetails();

            double rentalCost = v.calculateRental(rentalDays);
            double insurance = ((Insurable) v).calculateInsurance();
            double totalCost = rentalCost + insurance;

            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);
            System.out.println("Insurance: " + insurance);
            System.out.println("Total Cost: " + totalCost);
            System.out.println(((Insurable) v).getInsuranceDetails());
            System.out.println("----------------------------------");
        }
    }
}
