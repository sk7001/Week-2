/*
Problem 1
import java.util.Scanner;
class Book{
    String title, author;
    int price;
    Book(){
        this.title = "Science";
        this.author = "Sobhit";
        this.price = 1499;
    }
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class constructorsLevel1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Default Constructor");
        Book book1 = new Book();
        book1.display();

        System.out.println("2. Parameterised Constructor");
        System.out.println("Please enter title of book");
        String title = scanner.nextLine();
        System.out.println("Please enter the name of author of book");
        String author = scanner.nextLine();
        System.out.println("Please enter price of book");
        int price = scanner.nextInt();
        Book book2 = new Book(title, author, price);
        book2.display();
        scanner.close();
    }
}
*/

/*
Problem 2
import java.util.Scanner;

class Circle{
    int radius;
    Circle(){
        this(5);
    }
    Circle(int radius){
        this.radius = radius;
    }
    int display(){
        return (radius);
    }
    double displayCircumference(){
        return (2*Math.PI*radius);
    }
    double displayArea(){
        return (Math.PI*(double)Math.pow(radius,2));
    }
}
public class constructorsLevel1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Default chained constructor");
        Circle circle = new Circle();
        System.out.println("Radius is " + circle.display());
        System.out.println("Circumference is " + circle.displayCircumference());
        System.out.println("Area is " + circle.displayArea());
        System.out.println();
        System.out.println("Parameterised chain constructor");
        System.out.println("Please enter the radius");
        int radius = scanner.nextInt();
        Circle circle1 = new Circle(radius);
        System.out.println("Radius is " + circle1.display());
        System.out.println("Circumference is " + circle1.displayCircumference());
        System.out.println("Area is " + circle1.displayArea());
    }
}
*/

/*
Problem 3
import java.util.Scanner;

class Person{
    String name;
    int age;
    float height, weight;
    Person(String name, int age, float height, float weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    Person(Person person){
        this.name = person.name;
        this.age = person.age;
        this.height = person.height;
        this.weight = person.weight;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}
public class constructorsLevel1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter persons name");
        String name = scanner.nextLine();
        System.out.println("Please enter persons age");
        int age = scanner.nextInt();
        System.out.println("Please enter persons height");
        float height = scanner.nextFloat();
        System.out.println("Please enter persons weight");
        float weight = scanner.nextFloat();
        System.out.println("Parameterised Constructor");
        Person person = new Person(name, age, height, weight);
        person.display();
        System.out.println();
        System.out.println("Copy Constructor");
        Person person1 = new Person(person);
        person1.display();
        scanner.close();
    }
}
*/

/*
Problem 4
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

public class constructorsLevel1 {
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
*/

/*
Problem 5
import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;
    boolean isAvailable;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is currently not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

public class constructorsLevel1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter author name:");
        String author = scanner.nextLine();
        System.out.println("Enter book price:");
        double price = scanner.nextDouble();

        Book book = new Book(title, author, price);
        book.display();

        System.out.println("\nTrying to borrow book...");
        book.borrowBook();
        book.display();

        System.out.println("\nTrying to borrow again...");
        book.borrowBook();

        scanner.close();
    }
}
*/

/*
Problem 6
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

public class constructorsLevel1 {
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
*/