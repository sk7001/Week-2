/*
Problem 1
import java.util.Scanner;

class Student{
    public int rollNumber;
    protected String name;
    private float CGPA;
    Student(int rollNumber, String name, float CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public float getCGPA(){
        return CGPA;
    }
}
class PostgraduateStudent extends Student{
    PostgraduateStudent(int rollNumber, String name, float CGPA) {
        super(rollNumber, name, CGPA);
    }
    void display(){
        System.out.println("Student name : " + name);
        System.out.println("Student roll number : " + rollNumber);
        System.out.println("Student CGPA : " + getCGPA());
    }
}
public class AccessModifiers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the student");
        String name = scanner.nextLine();
        System.out.println("Please enter the roll number of the student");
        int rollNUmber = scanner.nextInt();
        System.out.println("Please enter the student's CGPA");
        float CGPA = scanner.nextFloat();

        PostgraduateStudent student = new PostgraduateStudent(rollNUmber, name, CGPA);
        student.display();
    }
}
*/

/*
Problem 2
import java.util.Scanner;

class Book{
    public String ISBN;
    protected String title;
    private String author;
    Book(String ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    String getAuthor(){
        return author;
    }
}
class EBook extends Book{
    EBook(String ISBN, String title, String author){
        super(ISBN, title, author);
    }
    void display(){
        System.out.println("Book title: " + title);
        System.out.println("Book ISBN: " + ISBN);
        System.out.println("Book author: " + getAuthor());
    }
}
public class AccessModifiers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter title of the book: ");
        String title = scanner.nextLine();
        System.out.println("Please enter ISBN of the book: ");
        String ISBN = scanner.nextLine();
        System.out.println("Please enter author of the book: ");
        String author = scanner.nextLine();

        EBook book = new EBook(ISBN, title, author);
        book.display();
    }
}
 */

/*
Problem 3
import java.util.Scanner;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + getBalance());
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter account holder name: ");
        String accountHolder = scanner.nextLine();
        System.out.println("Please enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Please enter account balance: ");
        double balance = scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(accountNumber, accountHolder, balance);
        account.display();
    }
}
 */

/*
Problem 4
import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter department: ");
        String department = scanner.nextLine();
        System.out.println("Please enter salary: ");
        double salary = scanner.nextDouble();

        Manager manager = new Manager(employeeID, department, salary);
        manager.display();
    }
}
*/