import java.util.Scanner;
class MovieTicket {
    String movieName, seatNumber;
    int price;
    MovieTicket(String movieName, String seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    void display() {
        System.out.println("Name of the movie : " + movieName);
        System.out.println("Seat number : " + seatNumber);
        System.out.println("Price : " + price);
    }
}
public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter movie name");
        String movieName = scanner.nextLine();
        System.out.println("Enter seat number");
        String seatNumber = scanner.nextLine();
        System.out.println("Enter the price of ticket");
        int price = scanner.nextInt();
        MovieTicket movieTicket = new MovieTicket(movieName, seatNumber, price);
        movieTicket.display();
    }
}
