/*
Problem 1
import java.util.Scanner;

class Product{
    String productName;
    int price;
    static int totalProducts;
    Product(String productName, int price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    void displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Product price: " + price);
    }
    static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
    }

}
public class InstanceClassVariablesMethods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add product 1");
        System.out.println("Please enter product name");
        String productName = scanner.nextLine();
        System.out.println("Please enter product price");
        int price = scanner.nextInt();
        Product product = new Product(productName, price);

        System.out.println("Add product 2");
        System.out.println("Please enter product name");
        scanner.nextLine();
        productName = scanner.nextLine();
        System.out.println("Please enter product price");
        price = scanner.nextInt();
        Product product1 = new Product(productName, price);

        product.displayProductDetails();
        product1.displayProductDetails();
        Product.displayTotalProducts();
    }
}
*/

/*
Problem 3
import java.util.Scanner;

class Course{
    String courseName;
    int duration, fee;
    static String institutionName = "SRMIST";
    Course(String courseName, int duration, int fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails(){
        System.out.println("Course name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute name: " + institutionName);
    }
    static void updateInstitueName(String newInstituteName){
        institutionName = newInstituteName;
    }
}

public class InstanceClassVariablesMethods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name of the course");
        String courseName = scanner.nextLine();
        System.out.println("Please enter duration of the course");
        int duration = scanner.nextInt();
        System.out.println("Please enter price of the course");
        int fee = scanner.nextInt();
        scanner.nextLine();
        Course course = new Course(courseName, duration, fee);
        course.displayCourseDetails();

        System.out.println("Please enter new name to change the Institute name");
        String instituteName = scanner.nextLine();
        Course.updateInstitueName(instituteName);

        course.displayCourseDetails();

    }
}
 */

/*
Problem 3
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

public class InstanceClassVariablesMethods {
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
*/