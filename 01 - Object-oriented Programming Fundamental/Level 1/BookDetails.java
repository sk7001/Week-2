import java.util.Scanner;
class Book {
    String title, author;
    int price;
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Book title: " + title);
        System.out.println("Author of " + title + " : " + author);
        System.out.println("Employee Salary: " + price);
    }
}
public class BookDetails {
    public static void main(String[] args) {
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
