import java.util.Scanner;
class CarRental {
   String customerName;
   String carModel;
   int rentalDays;
   CarRental(String customerName, String carModel, int rentalDays) {
       this.customerName = customerName;
       this.carModel = carModel;
       this.rentalDays = rentalDays;
   }
   CarRental(CarRental rental) {
       this.customerName = rental.customerName;
       this.carModel = rental.carModel;
       this.rentalDays = rental.rentalDays;
   }
   double calculateTotalCost() {
       double ratePerDay = 3600.0;
       return ratePerDay * rentalDays;
   }
   void display() {
       System.out.println("Customer Name: " + customerName);
       System.out.println("Car Model: " + carModel);
       System.out.println("Rental Days: " + rentalDays);
       System.out.println("Total Cost: Rs." + calculateTotalCost());
   }
}
public class CarRentalDemo {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter customer name:");
       String customerName = scanner.nextLine();
       System.out.println("Enter car model:");
       String carModel = scanner.nextLine();
       System.out.println("Enter number of rental days:");
       int rentalDays = scanner.nextInt();
       System.out.println("Parameterized Constructor");
       CarRental rental = new CarRental(customerName, carModel, rentalDays);
       rental.display();
       System.out.println("\nCopy Constructor");
       CarRental copyRental = new CarRental(rental);
       copyRental.display();
       scanner.close();
   }
}
