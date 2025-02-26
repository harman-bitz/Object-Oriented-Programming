class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}

// Main class to test the MovieTicket class
public class MovieTicketDemo {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers", "A12", 12.50);
        ticket1.displayTicketDetails();
        
        MovieTicket ticket2 = new MovieTicket("Inception", "B5", 15.00);
        ticket2.displayTicketDetails();
    }
}
