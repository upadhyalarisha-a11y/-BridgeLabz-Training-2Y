
public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Default Constructor
    public LibraryBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.availability = true;
    }

    // Parameterized Constructor
    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public boolean borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
            return true;
        } else {
            System.out.println("Sorry, this book is currently unavailable.");
            return false;
        }
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("1984", "George Orwell", 250.0, true);
        book.displayBookDetails();

        System.out.println();

        // Try borrowing the book
        book.borrowBook();

        System.out.println();

        // Try borrowing again to show unavailable case
        book.borrowBook();
    }
}
