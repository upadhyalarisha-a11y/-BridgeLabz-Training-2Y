// File: CartItem.java
import java.util.ArrayList;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Static cart to hold multiple items
    static ArrayList<CartItem> cart = new ArrayList<>();

    // Method to add item to cart
    public static void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    // Method to remove item from cart by name
    public static void removeItem(String name) {
        boolean removed = false;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(name)) {
                System.out.println(cart.get(i).itemName + " removed from cart.");
                cart.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(name + " not found in cart.");
        }
    }

    // Method to display total cost
    public static void displayTotalCost() {
        double total = 0;
        System.out.println("Items in cart:");
        for (CartItem item : cart) {
            System.out.println("- " + item.itemName + " x" + item.quantity + " : Rs. " + (item.price * item.quantity));
            total += item.price * item.quantity;
        }
        System.out.println("Total Cost: Rs. " + total);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Book", 200, 2);
        CartItem item2 = new CartItem("Pen", 10, 5);
        addItem(item1);
        addItem(item2);

        displayTotalCost();
        removeItem("Pen");
        displayTotalCost();
    }
}

