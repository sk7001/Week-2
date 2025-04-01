import java.util.Scanner;
class Product{
   String productName;
   int price;
   static int totalProducts;
   Product(String productName, int price){
       this.productName = productName;
       this.price = price;
       totalProducts++;
   }
   void displayProductDetails(){
       System.out.println("Product Name: " + productName);
       System.out.println("Product price: " + price);
   }
   static void displayTotalProducts(){
       System.out.println("Total Products: " + totalProducts);
   }
}
public class ProductInventory {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Add product 1");
       System.out.println("Please enter product name");
       String productName = scanner.nextLine();
       System.out.println("Please enter product price");
       int price = scanner.nextInt();
       Product product = new Product(productName, price);
       System.out.println("Add product 2");
       System.out.println("Please enter product name");
       scanner.nextLine();
       productName = scanner.nextLine();
       System.out.println("Please enter product price");
       price = scanner.nextInt();
       Product product1 = new Product(productName, price);
       product.displayProductDetails();
       product1.displayProductDetails();
       Product.displayTotalProducts();
   }
}
