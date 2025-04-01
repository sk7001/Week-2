import java.util.Scanner;
class MobilePhone {
    String Mobile, model;
    int price;
    MobilePhone(String Mobile, String model, int price) {
        this.Mobile = Mobile;
        this.model = model;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Brand of mobile phone : " + Mobile);
        System.out.println("Model of mobile phone : " + model);
        System.out.println("Price of mobile phone : " + price);
    }
}
public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the brand of mobile:");
        String mobile = scanner.nextLine();
        System.out.println("Please enter the model of mobile:");
        String model = scanner.nextLine();
        System.out.println("Please enter the price of mobile:");
        int price = scanner.nextInt();
        MobilePhone Mobile = new MobilePhone(mobile, model, price);
        Mobile.displayDetails();
    }
}
