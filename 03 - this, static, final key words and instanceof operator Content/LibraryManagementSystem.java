import java.util.Scanner;

class Book {
    static String libraryName = "SRM Library";
    String title;
    String author;
    final int isbn;
    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    static void displayLibraryName() {
        System.out.println("Name of library is " + libraryName);
    }
    void displayDetails() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book " + author);
        System.out.println("ISBN code fo the book " + isbn);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title of the book");
        String title = scanner.nextLine();
        System.out.println("Please enter the name of the author of the book");
        String author = scanner.nextLine();
        System.out.println("Please enter the isbn number of the book");
        int isbn = scanner.nextInt();
        Book book = new Book(title, author, isbn);
        if (book instanceof Book) {
            book.displayDetails();
        }
        Book.displayLibraryName();
    }
}
