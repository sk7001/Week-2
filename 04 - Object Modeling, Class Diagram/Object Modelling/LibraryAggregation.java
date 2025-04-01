import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title, author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void displayBook() {
        System.out.println("Book name: " + title + ", Author name: " + author);
    }
}
class Library {
    String name;
    ArrayList<Book> books;
    Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }
    void addBook(Book book) {
        books.add(book);
    }
    void showBooks() {
        System.out.println("Library " + name);
        for (Book book : books) {
            book.displayBook();
        }
    }
}
public class LibraryAggregation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter title of the book");
        String bookTitle = scanner.nextLine();
        System.out.println("Please enter the author of the book");
        String author = scanner.nextLine();
        Book b1 = new Book(bookTitle, author);
        Library l1 = new Library("School Library");
        l1.addBook(b1);
        Library l2 = new Library("Public Library");
        l2.addBook(b1);
        scanner.close();
        l1.showBooks();
        l2.showBooks();
    }
}
