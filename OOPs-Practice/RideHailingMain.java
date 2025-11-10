// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + 
                           ", Driver: " + driverName + 
                           ", Rate per Km: " + ratePerKm);
    }

    // Abstract method
    public abstract double calculateFare(double distance);
}

// GPS Interface
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car class
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = location;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Bike class
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = location;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Auto class
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = location;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Main class
public class RideHailingMain {
    public static void main(String[] args) {
        Vehicle[] rides = new Vehicle[3];
        rides[0] = new Car("C001", "Alice", 15, "Downtown");
        rides[1] = new Bike("B001", "Bob", 8, "Station Road");
        rides[2] = new Auto("A001", "Charlie", 10, "Market Square");

        double distance = 12.5; // Example distance in Km

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Current Fare for " + distance + " Km: " + v.calculateFare(distance));

            GPS gps = (GPS) v;
            System.out.println("Current Location: " + gps.getCurrentLocation());
            gps.updateLocation("New Location");
            System.out.println("Updated Location: " + gps.getCurrentLocation());

            System.out.println("------------------------------------");
        }
    }
}
