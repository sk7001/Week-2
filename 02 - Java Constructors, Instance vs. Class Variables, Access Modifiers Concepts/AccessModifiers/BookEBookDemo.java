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
public class BookEBookDemo{
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
