public class Book {
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Book paramBook = new Book("Java Programming", "James Gosling", 499.99);
        System.out.println("Parameterized Book:");
        paramBook.displayDetails();
    }
}
