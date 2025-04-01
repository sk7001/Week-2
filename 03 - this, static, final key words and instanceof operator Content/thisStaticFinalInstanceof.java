/*
Problem1
import java.util.Scanner;

class BankAccount{
    String accountHolder;
    final int accountNumber;
    static String bankName = "SRM Bank";
    static int totalAccounts;
    BankAccount(String accountHolder, int accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    static void getTotalAccounts(){
        System.out.println("The total number of accounts are " + totalAccounts);
    }
    void display(){
        System.out.println("Name of account holder: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Bank name: " + bankName);
    }
}

public class thisStaticFinalInstanceof {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter details of account holder 1");
        System.out.println("Please enter the name of the account holder");
        String accountHolder = scanner.nextLine();
        System.out.println("Please enter the account number");
        int accountNumber = scanner.nextInt();
        BankAccount bankAccount = new BankAccount(accountHolder, accountNumber);
        scanner.nextLine();
        System.out.println("Please enter details of account holder 2");
        System.out.println("Please enter the name of the account holder");
        accountHolder = scanner.nextLine();
        System.out.println("Please enter the account number");
        accountNumber = scanner.nextInt();
        BankAccount bankAccount1 = new BankAccount(accountHolder, accountNumber);
        if(bankAccount instanceof BankAccount){
                bankAccount.display();;
        }
        if(bankAccount1 instanceof BankAccount){
                bankAccount1.display();;
        }
        BankAccount.getTotalAccounts();
    }
}
*/

/*
Problem 2
import java.util.Scanner;

class Book{
    static String libraryName = "SRM Library";
    String title;
    String author;
    final int isbn;
    Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    static void displayLibraryName(){
        System.out.println("Name of library is " + libraryName);
    }
    void displayDetails(){
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book " + author);
        System.out.println("ISBN code fo the book " + isbn);
    }
}

public class thisStaticFinalInstanceof {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book");
        String title = scanner.nextLine();
        System.out.println("Please enter the name of the author of the book");
        String author = scanner.nextLine();
        System.out.println("Please enter the isbn number of the book");
        int isbn = scanner.nextInt();
        Book book = new Book(title, author, isbn);
        if(book instanceof Book){
            book.displayDetails();
        }
        Book.displayLibraryName();
    }
}
*/

/*
Problem 3
import java.util.Scanner;

class Employee {
    static String companyName = "Tech Solutions";
    String name;
    String designation;
    final int id;
    static int totalEmployees = 0;

    Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("Employee ID: " + id);
        }
    }
}

public class thisStaticFinalInstanceof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee designation:");
        String designation = scanner.nextLine();
        System.out.println("Enter employee ID:");
        int id = scanner.nextInt();

        Employee employee = new Employee(name, designation, id);
        if (employee instanceof Employee) {
            employee.displayDetails();
        }

        Employee.displayTotalEmployees();
    }
}
*/

/*
Problem 4
import java.util.Scanner;

class Product {
    static double discount = 10.0;
    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated discount: " + discount + "%");
    }

    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Product ID: " + productID);
        }
    }
}

public class thisStaticFinalInstanceof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:");
        String name = scanner.nextLine();
        System.out.println("Enter product price:");
        double price = scanner.nextDouble();
        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();
        System.out.println("Enter product ID:");
        int id = scanner.nextInt();

        Product product = new Product(name, price, quantity, id);
        if (product instanceof Product) {
            product.displayDetails();
        }

        Product.updateDiscount(15.0);
    }
}
*/

/*
Problem 5
import java.util.Scanner;

class Student {
    static String universityName = "SRM University";
    String name;
    String grade;
    final int rollNumber;
    static int totalStudents = 0;

    Student(String name, String grade, int rollNumber) {
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Student Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("Roll Number: " + rollNumber);
        }
    }
}

public class thisStaticFinalInstanceof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter grade:");
        String grade = scanner.nextLine();
        System.out.println("Enter roll number:");
        int rollNumber = scanner.nextInt();

        Student student = new Student(name, grade, rollNumber);
        if (student instanceof Student) {
            student.displayDetails();
        }

        Student.displayTotalStudents();
    }
}
*/

/*
Problem 6
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

public class thisStaticFinalInstanceof {
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
*/

/*
Problem 7
import java.util.Scanner;

class Patient {
    static String hospitalName = "City Hospital";
    String name;
    int age;
    String ailment;
    final int patientID;
    static int totalPatients = 0;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }
}

public class thisStaticFinalInstanceof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter ailment:");
        String ailment = scanner.nextLine();
        System.out.println("Enter patient ID:");
        int patientID = scanner.nextInt();

        Patient patient = new Patient(name, age, ailment, patientID);
        if (patient instanceof Patient) {
            patient.displayDetails();
        }

        Patient.getTotalPatients();
    }
}
*/