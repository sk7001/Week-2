import java.util.*;

interface Reservable {
    void reserveItem(String userName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String reservedBy = "";

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 21; }

    @Override
    public void reserveItem(String userName) {
        if (isAvailable) {
            isAvailable = false;
            reservedBy = userName;
            System.out.println("Book reserved by " + userName);
        } else {
            System.out.println("Book already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() { return isAvailable; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String reservedBy = "";

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 7; }

    @Override
    public void reserveItem(String userName) {
        if (isAvailable) {
            isAvailable = false;
            reservedBy = userName;
            System.out.println("Magazine reserved by " + userName);
        } else {
            System.out.println("Magazine already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() { return isAvailable; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String reservedBy = "";

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public void reserveItem(String userName) {
        if (isAvailable) {
            isAvailable = false;
            reservedBy = userName;
            System.out.println("DVD reserved by " + userName);
        } else {
            System.out.println("DVD already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() { return isAvailable; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book("B001", "Java Basics", "John Doe"));
        items.add(new Magazine("M001", "Tech Monthly", "Editor A"));
        items.add(new DVD("D001", "Interstellar", "Nolan"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            Reservable r = (Reservable) item;
            System.out.println("Available: " + r.checkAvailability());
            r.reserveItem("User1");
            System.out.println("Available After Reserve: " + r.checkAvailability());
            System.out.println();
        }
    }
}
