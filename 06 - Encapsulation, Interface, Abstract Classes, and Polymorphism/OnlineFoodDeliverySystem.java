interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    private static final double DISCOUNT = 0.05;
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 - DISCOUNT);
    }
}

class NonVegItem extends FoodItem {
    private static final double DISCOUNT = 0.02;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 - DISCOUNT);
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Veg Pizza", 300, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 150, 3);

        vegItem.getItemDetails();
        System.out.println("Total Price: " + vegItem.calculateTotalPrice());
        System.out.println();

        nonVegItem.getItemDetails();
        System.out.println("Total Price: " + nonVegItem.calculateTotalPrice());
    }
}
