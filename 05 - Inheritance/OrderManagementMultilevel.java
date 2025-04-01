import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Order{
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
   int orderId;
   LocalDate orderDate;
   void addOrders(int orderId, String orderDate){
       this.orderId = orderId;
       this.orderDate = LocalDate.parse(orderDate, formatter);
   }
   void displayOrder(){
       System.out.println("Order ID: " + orderId);
       System.out.println("Order date: " + orderDate);
   }
}
class ShippedOrder extends Order{
   int trackingNumber;
   void addOrders(int trackingNumber){
       this.trackingNumber = trackingNumber;
   }
   @Override
   void displayOrder() {
       super.displayOrder();
       System.out.println("Tracking Number: " + trackingNumber);
   }
}
class DeliveredOrder extends ShippedOrder{
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
   LocalDate deliveryDate;
   void addOrders(String deliveryDate){
       this.deliveryDate = LocalDate.parse(deliveryDate, formatter);
   }
   @Override
   void displayOrder() {
       super.displayOrder();
       System.out.println("Delivery date " + deliveryDate);
   }
}
public class OrderManagementMultilevel {
   public static void main(String[] args){
       DeliveredOrder order = new DeliveredOrder();
       order.addOrders(123, "12-04-2024");
       order.addOrders(123456);
       order.addOrders("30-04-2025");
       order.displayOrder();
   }
}
