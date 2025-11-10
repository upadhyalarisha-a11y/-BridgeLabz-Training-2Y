// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }

    // Abstract method
    public abstract double calculateTotalPrice();
}

// Discountable interface
interface Discountable {
    double applyDiscount(double discountPercent);
    String getDiscountDetails(double discountPercent);
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // no extra charges
    }

    @Override
    public double applyDiscount(double discountPercent) {
        return calculateTotalPrice() * (1 - discountPercent / 100);
    }

    @Override
    public String getDiscountDetails(double discountPercent) {
        return "Veg Item Discount: " + discountPercent + "% applied.";
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_CHARGE = 50.0; // fixed extra charge

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    @Override
    public double applyDiscount(double discountPercent) {
        return calculateTotalPrice() * (1 - discountPercent / 100);
    }

    @Override
    public String getDiscountDetails(double discountPercent) {
        return "Non-Veg Item Discount: " + discountPercent + "% applied.";
    }
}

// Main class
public class FoodDeliveryMain {
    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[2];
        order[0] = new VegItem("Paneer Butter Masala", 200, 2);
        order[1] = new NonVegItem("Chicken Biryani", 250, 1);

        double discount = 10; // 10% discount

        for (FoodItem item : order) {
            item.getItemDetails();
            double totalPrice = item.calculateTotalPrice();

            Discountable discountableItem = (Discountable) item;
            double finalPrice = discountableItem.applyDiscount(discount);

            System.out.println(discountableItem.getDiscountDetails(discount));
            System.out.println("Original Price: " + totalPrice);
            System.out.println("Final Price after Discount: " + finalPrice);
            System.out.println("----------------------------------");
        }
    }
}
