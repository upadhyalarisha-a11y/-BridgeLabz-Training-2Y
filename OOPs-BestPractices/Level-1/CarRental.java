
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 0;
        this.totalCost = 0.0;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    // Private method to calculate totalCost (let's assume a fixed rate per day for simplicity)
    private void calculateTotalCost() {
        double ratePerDay = 1000; // example rate
        totalCost = rentalDays * ratePerDay;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        System.out.println();

        CarRental paramRental = new CarRental("Alice", "Toyota Camry", 5);
        System.out.println("Parameterized Rental:");
        paramRental.displayRentalDetails();
    }
}
