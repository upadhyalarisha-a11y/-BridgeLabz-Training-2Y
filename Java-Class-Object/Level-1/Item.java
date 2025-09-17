// File: Item.java
public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: Rs. " + price);
    }

    // Method to get total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(1001, "Notebook", 45.5);
        item.displayItemDetails();

        int quantity = 10;
        System.out.println("Total cost for " + quantity + " units: Rs. " + item.calculateTotalCost(quantity));
    }
}
