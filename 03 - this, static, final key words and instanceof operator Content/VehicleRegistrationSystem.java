import java.util.Scanner;

class Vehicle {
    static double registrationFee = 500.0;
    String ownerName;
    String vehicleType;
    final String registrationNumber;
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated registration fee: " + registrationFee);
    }
    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter owner name:");
        String owner = scanner.nextLine();
        System.out.println("Enter vehicle type:");
        String type = scanner.nextLine();
        System.out.println("Enter registration number:");
        String regNo = scanner.nextLine();
        Vehicle vehicle = new Vehicle(owner, type, regNo);
        if (vehicle instanceof Vehicle) {
            vehicle.displayDetails();
        }
        Vehicle.updateRegistrationFee(600.0);
    }
}
