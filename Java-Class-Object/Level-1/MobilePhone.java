
public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs. " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S23", 74999.0);
        phone.displayDetails();
    }
}
