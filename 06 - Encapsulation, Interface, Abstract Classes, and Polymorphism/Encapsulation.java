/*
Problem
import java.util.*;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee ft = new FullTimeEmployee("E001", "Alice", 50000);
        ft.assignDepartment("HR");

        PartTimeEmployee pt = new PartTimeEmployee("E002", "Bob", 500, 40);
        pt.assignDepartment("IT");

        employees.add(ft);
        employees.add(pt);

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println("Department: " + ((Department)e).getDepartmentDetails());
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println();
        }
    }
}
*/

/*
Problem
import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract double calculateDiscount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.1;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.2;
    }

    public double calculateTax() {
        return getPrice() * 0.12;
    }

    public String getTaxDetails() {
        return "12% GST on Clothing";
    }
}

class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E1001", "Smartphone", 30000));
        products.add(new Clothing("C2001", "T-Shirt", 1500));
        products.add(new Groceries("G3001", "Rice Bag", 1000));

        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            if (p instanceof Taxable) {
                System.out.println("Tax Info: " + ((Taxable)p).getTaxDetails());
            }
            System.out.println();
        }
    }
}
*/

/*
Problem 3
import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance: " + calculateInsurance();
    }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance: " + calculateInsurance();
    }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance: " + calculateInsurance();
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C101", 1000));
        vehicles.add(new Bike("B202", 300));
        vehicles.add(new Truck("T303", 1500));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: " + v.calculateRentalCost(rentalDays));
            System.out.println(((Insurable)v).getInsuranceDetails());
            System.out.println();
        }
    }
}
*/

/*
Problem 4
import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void displayDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for amount: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for amount: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 25000;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("SA001", "Alice", 15000);
        BankAccount acc2 = new CurrentAccount("CA001", "Bob", 30000);

        accounts.add(acc1);
        accounts.add(acc2);

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());
            Loanable loanAcc = (Loanable) acc;
            loanAcc.applyForLoan(10000);
            System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
            System.out.println();
        }
    }
}
*/

/*
Problem 5
import java.util.*;

interface Reservable {
    void reserveItem(String userName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String reservedBy = "";

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public void reserveItem(String userName) {
        if (isAvailable) {
            isAvailable = false;
            reservedBy = userName;
            System.out.println("Book reserved by " + userName);
        } else {
            System.out.println("Book already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String reservedBy = "";

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String userName) {
        if (isAvailable) {
            isAvailable = false;
            reservedBy = userName;
            System.out.println("Magazine reserved by " + userName);
        } else {
            System.out.println("Magazine already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String reservedBy = "";

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String userName) {
        if (isAvailable) {
            isAvailable = false;
            reservedBy = userName;
            System.out.println("DVD reserved by " + userName);
        } else {
            System.out.println("DVD already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001", "Java Basics", "John Doe"));
        items.add(new Magazine("M001", "Tech Monthly", "Editor A"));
        items.add(new DVD("D001", "Interstellar", "Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;
            System.out.println("Available: " + r.checkAvailability());
            r.reserveItem("User1");
            System.out.println("Available After Reserve: " + r.checkAvailability());
            System.out.println();
        }
    }
}
 */

/*
Problem 6
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    private static final double DISCOUNT = 0.05;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 - DISCOUNT);
    }
}

class NonVegItem extends FoodItem {
    private static final double DISCOUNT = 0.02;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 - DISCOUNT);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Veg Pizza", 300, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 150, 3);

        vegItem.getItemDetails();
        System.out.println("Total Price: " + vegItem.calculateTotalPrice());
        System.out.println();

        nonVegItem.getItemDetails();
        System.out.println("Total Price: " + nonVegItem.calculateTotalPrice());
    }
}
 */

/*
Problem 7
interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    private double dailyCharge;
    private int daysAdmitted;
    private String record;

    public InPatient(String patientId, String name, int age, double dailyCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyCharge = dailyCharge;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyCharge * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        this.record = record;
    }

    @Override
    public String viewRecords() {
        return record;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {

    }

    @Override
    public String viewRecords() {
        return "No records for outpatients";
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("P001", "John", 45, 500, 10);
        Patient outPatient = new OutPatient("P002", "Alice", 30, 200);

        inPatient.getPatientDetails();
        System.out.println("Bill: " + inPatient.calculateBill());
        System.out.println("Medical Record: " + ((MedicalRecord) inPatient).viewRecords());
        System.out.println();

        outPatient.getPatientDetails();
        System.out.println("Bill: " + outPatient.calculateBill());
        System.out.println("Medical Record: " + ((MedicalRecord) outPatient).viewRecords());
    }
}
*/

/*
Problem 8
interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Vehicle car = new Car("V001", "John", 15.0);
        Vehicle bike = new Bike("V002", "Alice", 10.0);
        Vehicle auto = new Auto("V003", "Bob", 12.0);

        car.getVehicleDetails();
        System.out.println("Fare for 20 Km: " + car.calculateFare(20));
        System.out.println();

        bike.getVehicleDetails();
        System.out.println("Fare for 20 Km: " + bike.calculateFare(20));
        System.out.println();

        auto.getVehicleDetails();
        System.out.println("Fare for 20 Km: " + auto.calculateFare(20));
        System.out.println();

        System.out.println("Current Location of Car: " + ((GPS) car).getCurrentLocation());
        ((GPS) car).updateLocation("Location A");
        System.out.println("Updated Location of Car: " + ((GPS) car).getCurrentLocation());
    }
}
 */