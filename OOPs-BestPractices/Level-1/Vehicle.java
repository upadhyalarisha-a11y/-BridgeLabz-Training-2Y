
public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 500.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Meena", "Bike");

        v1.displayVehicleDetails();
        System.out.println();

        v2.displayVehicleDetails();
        System.out.println();

        System.out.println("Updating Registration Fee...");
        Vehicle.updateRegistrationFee(600.0);

        v1.displayVehicleDetails();
        System.out.println();

        v2.displayVehicleDetails();
    }
}
