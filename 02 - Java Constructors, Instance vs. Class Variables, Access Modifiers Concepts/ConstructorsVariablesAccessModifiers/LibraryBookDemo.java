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
public class LibraryBookDemo {
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
