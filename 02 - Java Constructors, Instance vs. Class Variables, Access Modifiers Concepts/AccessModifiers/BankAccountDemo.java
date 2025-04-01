import java.util.Scanner;
class BankAccount {
   public int accountNumber;
   protected String accountHolder;
   private double balance;
   BankAccount(int accountNumber, String accountHolder, double balance) {
       this.accountNumber = accountNumber;
       this.accountHolder = accountHolder;
       this.balance = balance;
   }
   double getBalance() {
       return balance;
   }
   void setBalance(double balance) {
       this.balance = balance;
   }
}
class SavingsAccount extends BankAccount {
   SavingsAccount(int accountNumber, String accountHolder, double balance) {
       super(accountNumber, accountHolder, balance);
   }
   void display() {
       System.out.println("Account Holder: " + accountHolder);
       System.out.println("Account Number: " + accountNumber);
       System.out.println("Account Balance: " + getBalance());
   }
}
public class BankAccountDemo {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter account holder name: ");
       String accountHolder = scanner.nextLine();
       System.out.println("Please enter account number: ");
       int accountNumber = scanner.nextInt();
       System.out.println("Please enter account balance: ");
       double balance = scanner.nextDouble();
       SavingsAccount account = new SavingsAccount(accountNumber, accountHolder, balance);
       account.display();
   }
}
