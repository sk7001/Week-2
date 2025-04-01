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
public class BookDemo {
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
