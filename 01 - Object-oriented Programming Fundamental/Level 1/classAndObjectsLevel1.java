/*
Problem 1
import java.util.Scanner;
class Employee{
    String name;
    int id, salary;
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}
public class classAndObjectsLevel1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Employee name :");
        String name = scanner.nextLine();
        System.out.println("Please enter the Employee ID :");
        int id = scanner.nextInt();
        System.out.println("Please enter the Employee salary :");
        int salary= scanner.nextInt();
        Employee emp = new Employee(name, id, salary);
        emp.displayDetails();
    }
}
*/

/*
Problem 2
import java.util.Scanner;
class Circle{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    void displayArea(){
        System.out.format("Area of circle for %d is %.2f", radius, Math.PI*(double)Math.pow(radius,2));
    }
}
public class classAndObjectsLevel1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius of circle:");
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        circle.displayArea();
    }
}
*/

/*
Problem 3
import java.util.Scanner;
class Book{
    String title, author;
    int price;
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails(){
        System.out.println("Book title: " + title);
        System.out.println("Author of " + title + " : " + author);
        System.out.println("Employee Salary: " + price);
    }
}
public class classAndObjectsLevel1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title fo the book:");
        String title = scanner.nextLine();
        System.out.println("Please enter the name of author of book " + title + " : ");
        String author = scanner.nextLine();
        System.out.println("Please enter the price of the book " + title + " : ");
        int price = scanner.nextInt();
        Book book = new Book(title, author, price);
        book.displayDetails();
    }
}
*/

/*
Problem 4
import java.util.Scanner;
class Item{
    String itemCode, itemName;
    int price, totalCost, quantity;
    Item(String itemCode, String itemName, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    void calculateTotalCost(int quantity){
        this.quantity = quantity;
        this.totalCost = quantity*price;
    }
    void displayDetails(){
        System.out.println("Item code : " + itemCode);
        System.out.println("Item name : " + itemName);
        System.out.println("Price of each" + itemName + " : " + price);
        System.out.println("Total price of " + itemName + " for " + quantity + " nos. : " + totalCost);
    }
}
public class classAndObjectsLevel1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the code of the item :");
        String itemCode = scanner.nextLine();
        System.out.println("Please enter the name of the item : ");
        String itemName = scanner.nextLine();
        System.out.println("Please enter the price of each " + itemName + " : ");
        int price = scanner.nextInt();
        System.out.println("Please enter the quantity of " + itemName + " : ");
        int quantity= scanner.nextInt();
        Item item = new Item(itemCode, itemName, price);
        item.calculateTotalCost(quantity);
        item.displayDetails();
    }
}
 */

/*
Problem 5
import java.util.Scanner;
class MobilePhone{
    String Mobile, model;
    int price;
    MobilePhone(String Mobile, String model, int price){
        this.Mobile = Mobile;
        this.model = model;
        this.price = price;
    }
    void displayDetails(){
        System.out.println("Brand of mobile phone : " + Mobile);
        System.out.println("Model of mobile phone : " + model);
        System.out.println("Price of mobile phone : " + price);
    }
}
public class classAndObjectsLevel1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the brand of mobile:");
        String mobile = scanner.nextLine();
        System.out.println("Please enter the model of mobile:");
        String model = scanner.nextLine();
        System.out.println("Please enter the price of mobile:");
        int price = scanner.nextInt();
        MobilePhone Mobile = new MobilePhone(mobile, model, price);
        Mobile.displayDetails();
    }
}
 */