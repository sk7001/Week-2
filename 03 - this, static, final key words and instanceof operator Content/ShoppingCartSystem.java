import java.util.Scanner;

class Product {
    static double discount = 10.0;
    String productName;
    double price;
    int quantity;
    final int productID;
    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated discount: " + discount + "%");
    }
    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Product ID: " + productID);
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name:");
        String name = scanner.nextLine();
        System.out.println("Enter product price:");
        double price = scanner.nextDouble();
        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();
        System.out.println("Enter product ID:");
        int id = scanner.nextInt();
        Product product = new Product(name, price, quantity, id);
        if (product instanceof Product) {
            product.displayDetails();
        }
        Product.updateDiscount(15.0);
    }
}
