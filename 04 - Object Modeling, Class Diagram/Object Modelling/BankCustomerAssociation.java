class Bank {
    String name;
    Bank(String name) {
        this.name = name;
    }
    void openAccount(Customer customer) {
        System.out.println(customer.name + " opened an account at " + name);
    }
}
class Customer {
    String name;
    Customer(String name) {
        this.name = name;
    }
    void viewBalance() {
        System.out.println(name + "'s balance is Rs.5000");
    }
}
public class BankCustomerAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Customer cust1 = new Customer("Alice");
        Customer cust2 = new Customer("Bob");
        bank.openAccount(cust1);
        bank.openAccount(cust2);
        cust1.viewBalance();
        cust2.viewBalance();
    }
}
