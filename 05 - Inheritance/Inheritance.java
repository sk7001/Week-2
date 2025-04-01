/*
Problem 1
class Animal {
    void makeSound(){
        System.out.println("Animal is making sound.");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat is meowing");
    }
}
class Bird extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bird is singing");
    }
}
public class Inheritance {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Bird bird = new Bird();
        bird.makeSound();
    }
}
*/

/*
Problem 2
class Employee{
    String name;
    int id;
    int salary;
    void addDetails(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee{
    int teamSize;
    void addDetails(String name, int id, int salary, int teamSize){
        super.addDetails(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println();
    }
}
class Developer extends Employee{
    String programmingLanguage;
    void addDetails(String name, int id, int salary, String programmingLanguage){
        super.addDetails(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println();
    }
}
class Intern extends Employee{
    int duration;
    void addDetails(String name, int id, int salary, int duration){
        super.addDetails(name, id, salary);
        this.duration = duration;
    }
    @Override
    void displayDetails(){
         super.displayDetails();
         System.out.println("Duration: " + duration);
        System.out.println();
    }
}
public class Inheritance{
    public static void main(String[] args){
        Manager manager = new Manager();
        manager.addDetails("Sobhit", 41, 50000, 5);
        manager.displayDetails();
        Developer developer = new Developer();
        developer.addDetails("Souji", 41, 50000, "Python");
        developer.displayDetails();
        Intern intern = new Intern();
        intern.addDetails("Sridhar", 41, 50000, 5);
        intern.displayDetails();
    }
}
*/

/*
Problem 3
class Vehicle {
    int maxSpeed;
    String fuelType;

    void addDetails(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    void addDetails(int maxSpeed, String fuelType, int seatCapacity) {
        super.addDetails(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println();
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    void addDetails(int maxSpeed, String fuelType, int loadCapacity) {
        super.addDetails(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " kg");
        System.out.println();
    }
}

class Motorcycle extends Vehicle {
    boolean hasCarrier;

    void addDetails(int maxSpeed, String fuelType, boolean hasCarrier) {
        super.addDetails(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
        System.out.println();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.addDetails(180, "Petrol", 5);

        Truck truck = new Truck();
        truck.addDetails(120, "Diesel", 10000);

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.addDetails(150, "Petrol", true);

        Vehicle[] vehicles = {car, truck, motorcycle};

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
*/

//Single Inheritance

/*
Problem 1
class Book{
    String title;
    int publicationYear;
    void addBook(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
    void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
class Author extends Book{
    String name;
    String bio;
    void addBook(String title, int publicationYear, String name, String bio){
        super.addBook(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println();
    }
}
public class Inheritance{
    public static void main(String[] args){
        Author author = new Author();
        author.addBook("Science", 2025, "Sobhit", "It's a book of miracle");
        author.displayInfo();
    }
}
 */

/*
Problem 2
class Device {
    String deviceId;
    String status;

    void setDevice(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    void setDevice(String deviceId, String status, int temperatureSetting) {
        super.setDevice(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        System.out.println();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.setDevice("THERMO123", "On", 22);
        thermostat.displayStatus();
    }
}
*/

//Multilevel Inheritance

/*
Problem 1
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Order{
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    int orderId;
    LocalDate orderDate;
    void addOrders(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = LocalDate.parse(orderDate, formatter);
    }
    void displayOrder(){
        System.out.println("Order ID: " + orderId);
        System.out.println("Order date: " + orderDate);
    }
}
class ShippedOrder extends Order{
    int trackingNumber;
    void addOrders(int trackingNumber){
        this.trackingNumber = trackingNumber;
    }

    @Override
    void displayOrder() {
        super.displayOrder();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder{
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate deliveryDate;
    void addOrders(String deliveryDate){
        this.deliveryDate = LocalDate.parse(deliveryDate, formatter);
    }
    @Override
    void displayOrder() {
        super.displayOrder();
        System.out.println("Delivery date " + deliveryDate);
    }
}
public class Inheritance {
    public static void main(String[] args){
        DeliveredOrder order = new DeliveredOrder();
        order.addOrders(123, "12-04-2024");
        order.addOrders(123456);
        order.addOrders("31-04-2025");
        order.displayOrder();
    }
}
*/

/*
Problem 2
class Course {
    String courseName;
    int duration;

    void addCourseDetails(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    void addCourseDetails(String courseName, int duration, String platform, boolean isRecorded) {
        super.addCourseDetails(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    void addCourseDetails(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super.addCourseDetails(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + (fee - (fee * discount / 100)));
        System.out.println();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse();
        course.addCourseDetails("Java Programming", 40, "Udemy", true, 199.99, 20);
        course.displayDetails();
    }
}
*/

//Hierarchical Inheritance

/*
Problem 1
class BankAccount {
    String accountNumber;
    double balance;

    void setAccountDetails(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void setAccountDetails(String accountNumber, double balance, double interestRate) {
        super.setAccountDetails(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    void setAccountDetails(String accountNumber, double balance, double withdrawalLimit) {
        super.setAccountDetails(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
        System.out.println();
    }
}

class FixedDepositAccount extends BankAccount {
    int lockInPeriod;

    void setAccountDetails(String accountNumber, double balance, int lockInPeriod) {
        super.setAccountDetails(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Lock-In Period: " + lockInPeriod + " months");
        System.out.println();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.setAccountDetails("SA1001", 1200.50, 4.5);
        savings.displayAccountType();

        CheckingAccount checking = new CheckingAccount();
        checking.setAccountDetails("CA2001", 3500.75, 1000);
        checking.displayAccountType();

        FixedDepositAccount fixed = new FixedDepositAccount();
        fixed.setAccountDetails("FD3001", 10000, 12);
        fixed.displayAccountType();
    }
}
*/

/*
Problem 2
class Person {
    String name;
    int age;

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    void setDetails(String name, int age, String subject) {
        super.setDetails(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println();
    }
}

class Student extends Person {
    int grade;

    void setDetails(String name, int age, int grade) {
        super.setDetails(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        displayDetails();
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

class Staff extends Person {
    String department;

    void setDetails(String name, int age, String department) {
        super.setDetails(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        displayDetails();
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setDetails("Anita", 35, "Mathematics");
        teacher.displayRole();

        Student student = new Student();
        student.setDetails("Ravi", 16, 10);
        student.displayRole();

        Staff staff = new Staff();
        staff.setDetails("Suresh", 40, "Administration");
        staff.displayRole();
    }
}
*/

//Hybrid Inheritance

/*
Problem 1
interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    void setDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String specialty;

    void setDetails(String name, int id, String specialty) {
        super.setDetails(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println("Cooking dishes. Specialty: " + specialty);
    }

    void displayRole() {
        displayDetails();
        performDuties();
        System.out.println();
    }
}

class Waiter extends Person implements Worker {
    String section;

    void setDetails(String name, int id, String section) {
        super.setDetails(name, id);
        this.section = section;
    }

    public void performDuties() {
        System.out.println("Serving customers in section: " + section);
    }

    void displayRole() {
        displayDetails();
        performDuties();
        System.out.println();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.setDetails("Ritika", 101, "Italian");
        chef.displayRole();

        Waiter waiter = new Waiter();
        waiter.setDetails("Arun", 102, "Garden View");
        waiter.displayRole();
    }
}
*/

/*
Problem 2
interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    void setDetails(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    void setDetails(String model, int maxSpeed, int batteryCapacity) {
        super.setDetails(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("Charging the electric vehicle. Battery capacity: " + batteryCapacity + " kWh");
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println();
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity;

    void setDetails(String model, int maxSpeed, int fuelTankCapacity) {
        super.setDetails(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void refuel() {
        System.out.println("Refueling the petrol vehicle. Fuel tank capacity: " + fuelTankCapacity + " liters");
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        System.out.println();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.setDetails("Tesla Model S", 250, 100);
        electricVehicle.displayDetails();
        electricVehicle.charge();

        PetrolVehicle petrolVehicle = new PetrolVehicle();
        petrolVehicle.setDetails("Ford Mustang", 220, 60);
        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
    }
}
*/