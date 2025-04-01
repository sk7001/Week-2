/*
Problem 1
import java.util.Scanner;
class Student{
    String name;
    char grade;
    int rollNumber, marks;
    Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    void calculateGrade(){
        if(marks>=90){
            this.grade = 'O';
        }else if(marks>=80){
            this.grade = 'A';
        }else if(marks>=70){
            this.grade = 'B';
        }else if(marks>=60){
            this.grade = 'C';
        }else if(marks>=50){
            this.grade = 'D';
        }else{
            this.grade = 'F';
        }
    }
    void displayResults(){
        calculateGrade();
        System.out.println("Name of the student: " + name);
        System.out.println("Roll number of the student: " + rollNumber);
        System.out.println("Marks of the student: " + marks);
        System.out.println("Grade of the student: " + grade);
    }
}
public class classAndObjectsLevel2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name of student: ");
        String name = scanner.nextLine();
        System.out.println("Please enter roll number of student: ");
        int rollNumber = scanner.nextInt();
        System.out.println("Please enter marks of student: ");
        int marks = scanner.nextInt();
        Student student = new Student(name, rollNumber, marks);
        student.displayResults();
    }
}
*/

/*
Problem 2
import java.util.Scanner;

class BankAccount{
    String accountHolder;
    int accountNumber, balance;
    BankAccount(String accountHolder, int accountNumber, int balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void depositMoney(int deposit){
        this.balance+=deposit;
        System.out.println("Amount of " + deposit + " have been deposited successfully.\nAvailable balance is " + this.balance);
    }
    void withdrawMoney(int withdraw){
        if( withdraw>this.balance){
            System.out.println("No sufficient balance to withdraw " + withdraw);
            System.out.println("Available balance is " + this.balance);
        }else{
            this.balance+=withdraw;
            System.out.println("Amount of " + withdraw + " have been withdrawn successfully.\nAvailable balance is " + this.balance);
        }
    }
    void displayDetails(){
        System.out.println("Name of the customer : " + accountHolder);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance : " + balance);

    }

}
public class classAndObjectsLevel2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of account holder : ");
        String accountHolder = scanner.nextLine();
        System.out.println("Please enter the account number : ");
        int accountNumber = scanner.nextInt();
        System.out.println("Please enter the balance : ");
        int balance = scanner.nextInt();
        BankAccount bankAccount = new BankAccount(accountHolder, accountNumber, balance);
        int input, amount;
        while(true){
            System.out.println("Please enter input for any of the operation below");
            System.out.println("1 for depositing money\n2 for withdrawing money\n3 for displaying account balance\n-1 to exit");
            input = scanner.nextInt();
            if(input==-1){
                break;
            }
            switch(input){
                case 1:
                    System.out.println("Please enter the amount to be deposited");
                    amount = scanner.nextInt();
                    bankAccount.depositMoney(amount);
                    break;
                case 2:
                    System.out.println("Please enter the amount to be withdrawn");
                    amount = scanner.nextInt();
                    bankAccount.withdrawMoney(amount);
                    break;
                case 3:
                    bankAccount.displayDetails();
                    break;
                default:
                    System.out.println("Invalid input : " + input);
            }
        }
    }
}
*/

/*
Problem 3
import java.util.Scanner;
class PalindromeChecker{
    String text;
    PalindromeChecker(String text){
        this.text = text;
    }
    void checkPalindrome(){
        boolean result = true;
        char[] textArr = text.toCharArray();
        for(int i = 0; i<textArr.length/2; i++) {
            if (textArr[i]!=(textArr[textArr.length - 1 - i])) {
                result = false;
                break;
            }
        }
        if(result){
            System.out.println("The input text is a palindrome");
        }else{
            System.out.println("The input text is not a palindrome");
        }
    }
}
public class classAndObjectsLevel2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        PalindromeChecker palindromeChecker = new PalindromeChecker(text);
        palindromeChecker.checkPalindrome();
    }
}
 */

/*
Problem 4
import java.util.Scanner;
class MovieTicket{
    String movieName, seatNumber;
    int price;
    MovieTicket(String movieName, String seatNumber, int price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    void display(){
        System.out.println("Name of the movie : " + movieName);
        System.out.println("Seat number : " + seatNumber);
        System.out.println("Price : " + price);
    }
}
public class classAndObjectsLevel2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter movie name");
        String movieName = scanner.nextLine();
        System.out.println("Enter seat number");
        String seatNumber = scanner.nextLine();
        System.out.println("Enter the price of ticket");
        int price = scanner.nextInt();
        MovieTicket movieTicket = new MovieTicket(movieName, seatNumber, price);
        movieTicket.display();
    }
}
*/

/*
Problem 5
import java.util.Scanner;
class CartItem {
    String itemName;
    int price;
    int quantity;
    void addItem(String name, int price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }
    void removeItem() {
        itemName = null;
        price = 0;
        quantity = 0;
    }
    void displayTotalCost() {
        if (itemName != null) {
            int total = price * quantity;
            System.out.println("Total cost: " + total);
        } else {
            System.out.println("No item in the cart.");
        }
    }
    void displayItem() {
        if (itemName != null) {
            System.out.println("Item: " + itemName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
        } else {
            System.out.println("No item in the cart.");
        }
    }
}
public class classAndObjectsLevel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartItem cart = new CartItem();
        String name = scanner.nextLine();
        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        cart.addItem(name, price, quantity);
        cart.displayItem();
        cart.displayTotalCost();
        cart.removeItem();
        cart.displayItem();
        cart.displayTotalCost();
    }
}
*/