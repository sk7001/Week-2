import java.util.Scanner;
class Vehicle {
   String ownerName;
   String vehicleType;
   static int registrationFee = 5000;
   Vehicle(String ownerName, String vehicleType) {
       this.ownerName = ownerName;
       this.vehicleType = vehicleType;
   }
   void displayVehicleDetails() {
       System.out.println("Owner Name: " + ownerName);
       System.out.println("Vehicle Type: " + vehicleType);
       System.out.println("Registration Fee: " + registrationFee);
   }
   static void updateRegistrationFee(int newFee) {
       registrationFee = newFee;
   }
}
public class VehicleRegistration {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter owner's name:");
       String ownerName = scanner.nextLine();
       System.out.println("Please enter vehicle type:");
       String vehicleType = scanner.nextLine();
       Vehicle vehicle = new Vehicle(ownerName, vehicleType);
       vehicle.displayVehicleDetails();
       System.out.println("\nEnter new registration fee to update:");
       int newFee = scanner.nextInt();
       Vehicle.updateRegistrationFee(newFee);
       System.out.println("\nAfter updating registration fee:");
       vehicle.displayVehicleDetails();
       scanner.close();
   }
}
