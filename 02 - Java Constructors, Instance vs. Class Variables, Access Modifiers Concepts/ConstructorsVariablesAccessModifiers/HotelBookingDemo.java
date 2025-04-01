import java.util.Scanner;
class HotelBooking {
   String guestName;
   String roomType;
   int nights;
   HotelBooking() {
       this("Default Guest", "Standard", 1);
   }
   HotelBooking(String guestName, String roomType, int nights) {
       this.guestName = guestName;
       this.roomType = roomType;
       this.nights = nights;
   }
   HotelBooking(HotelBooking booking) {
       this.guestName = booking.guestName;
       this.roomType = booking.roomType;
       this.nights = booking.nights;
   }
   void display() {
       System.out.println("Guest Name: " + guestName);
       System.out.println("Room Type: " + roomType);
       System.out.println("Nights: " + nights);
   }
}
public class HotelBookingDemo {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter guest name:");
       String guestName = scanner.nextLine();
       System.out.println("Enter room type:");
       String roomType = scanner.nextLine();
       System.out.println("Enter number of nights:");
       int nights = scanner.nextInt();
       System.out.println("Parameterized Constructor");
       HotelBooking booking = new HotelBooking(guestName, roomType, nights);
       booking.display();
       System.out.println("\nCopy Constructor");
       HotelBooking copyBooking = new HotelBooking(booking);
       copyBooking.display();
       scanner.close();
   }
}
