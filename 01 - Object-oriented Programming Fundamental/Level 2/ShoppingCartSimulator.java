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
public class ShoppingCartSimulator {
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
