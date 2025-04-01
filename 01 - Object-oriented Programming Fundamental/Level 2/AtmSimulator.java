import java.util.Scanner;
class BankAccount {
    String accountHolder;
    int accountNumber, balance;
    BankAccount(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void depositMoney(int deposit) {
        this.balance += deposit;
        System.out.println("Amount of " + deposit + " have been deposited successfully.\nAvailable balance is " + this.balance);
    }
    void withdrawMoney(int withdraw) {
        if (withdraw > this.balance) {
            System.out.println("No sufficient balance to withdraw " + withdraw);
            System.out.println("Available balance is " + this.balance);
        } else {
            this.balance -= withdraw;
            System.out.println("Amount of " + withdraw + " have been withdrawn successfully.\nAvailable balance is " + this.balance);
        }
    }
    void displayDetails() {
        System.out.println("Name of the customer : " + accountHolder);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Balance : " + balance);
    }
}
public class BankAccountSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of account holder : ");
        String accountHolder = scanner.nextLine();
        System.out.println("Please enter the account number : ");
        int accountNumber = scanner.nextInt();
        System.out.println("Please enter the balance : ");
        int balance = scanner.nextInt();
        BankAccount bankAccount = new BankAccount(accountHolder, accountNumber, balance);
        int input, amount;
        while (true) {
            System.out.println("Please enter input for any of the operation below");
            System.out.println("1 for depositing money\n2 for withdrawing money\n3 for displaying account balance\n-1 to exit");
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            switch (input) {
                case 1:
                    System.out.println("Please enter the amount to be deposited");
                    amount = scanner.nextInt();
                    bankAccount.depositMoney(amount);
                    break;
                case 2:
                    System.out.println("Please enter the amount to be withdrawn");
                    amount = scanner.nextInt();
                    bankAccount.withdrawMoney(amount);
                    break;
                case 3:
                    bankAccount.displayDetails();
                    break;
                default:
                    System.out.println("Invalid input : " + input);
            }
        }
    }
}
