import java.util.Scanner;
class Item {
    String itemCode, itemName;
    int price, quantity;
    Item(String itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    int calculateQuantity(int quantity) {
        this.quantity = quantity;
        return price * quantity;
    }
    void displayDetails() {
        System.out.println("Item code : " + itemCode);
        System.out.println("Item name : " + itemName);
        System.out.println("Price of each" + itemName + " : " + price);
        System.out.println("Total price of " + itemName + " for " + quantity + " nos. : " + calculateQuantity(quantity));
    }
}
public class ItemInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the code of the item :");
        String itemCode = scanner.nextLine();
        System.out.println("Please enter the name of the item : ");
        String itemName = scanner.nextLine();
        System.out.println("Please enter the price of each " + itemName + " : ");
        int price = scanner.nextInt();
        System.out.println("Please enter the quantity of " + itemName + " : ");
        int quantity = scanner.nextInt();
        Item item = new Item(itemCode, itemName, price);
        item.calculateQuantity(quantity);
        item.displayDetails();
    }
}
