// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    // Concrete method
    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    // Abstract method
    public abstract int getLoanDuration();
}

// Reservable interface
interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days for books
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println(getTitle() + " reserved successfully.");
        } else {
            System.out.println(getTitle() + " is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days for magazines
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println(getTitle() + " reserved successfully.");
        } else {
            System.out.println(getTitle() + " is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days for DVDs
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println(getTitle() + " reserved successfully.");
        } else {
            System.out.println(getTitle() + " is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

// Main class
public class LibraryManagementMain {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B001", "Java Programming", "James Gosling");
        items[1] = new Magazine("M001", "Tech World", "Editorial Team");
        items[2] = new DVD("D001", "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable reservableItem = (Reservable) item;
            System.out.println("Available: " + reservableItem.checkAvailability());
            reservableItem.reserveItem();
            System.out.println("Available after reservation: " + reservableItem.checkAvailability());
            System.out.println("--------------------------------");
        }
    }
}
