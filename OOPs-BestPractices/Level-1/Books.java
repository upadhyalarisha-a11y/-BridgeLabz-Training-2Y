
public class Books {
    public String ISBN;
    protected String title;
    private String author;

    public Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public getter and setter for private author attribute
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Books b1 = new Books("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayBookDetails();

        System.out.println();

        // Changing author using setter
        b1.setAuthor("J. Bloch");
        System.out.println("Author after update: " + b1.getAuthor());
    }
}

// Subclass to demonstrate access of public and protected members
class EBook extends Books {
    private double fileSize; // in MB

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);  // accessible here
        System.out.println("File Size: " + fileSize + " MB");
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 5.5);
        ebook.displayEBookDetails();
    }
}
