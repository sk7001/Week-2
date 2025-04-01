import java.util.ArrayList;
class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
}
class Order {
    private static int orderCounter = 1;
    private int orderId;
    private ArrayList<Product> products;
    public Order() {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>();
    }
    public int getOrderId() { return orderId; }
    public void addProduct(Product product) { products.add(product); }
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getName() + ": $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}
class Customer {
    private String name;
    private ArrayList<Order> orders;
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.getOrderId());
    }
    public void viewOrders() {
        System.out.println("\nCustomer: " + name + " - Order History:");
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println();
        }
    }
}
public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Mouse", 25.50);
        Product p3 = new Product("Keyboard", 45.00);
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        Order order1 = new Order();
        order1.addProduct(p1);
        order1.addProduct(p2);
        Order order2 = new Order();
        order2.addProduct(p2);
        order2.addProduct(p3);
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);
        customer1.viewOrders();
        customer2.viewOrders();
    }
}
