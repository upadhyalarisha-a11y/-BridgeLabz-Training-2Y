// File: MovieTicket.java
public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0.0;
        this.isBooked = false;
    }

    // Method to book ticket
    public void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully for seat " + seatNumber);
        } else {
            System.out.println("Ticket is already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + (isBooked ? seatNumber : "Not booked"));
        System.out.println("Price: " + (isBooked ? price : "N/A"));
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers: Endgame");
        ticket.displayTicketDetails();
        ticket.bookTicket("A12", 250);
        ticket.displayTicketDetails();
        ticket.bookTicket("A13", 300); // already booked
    }
}
