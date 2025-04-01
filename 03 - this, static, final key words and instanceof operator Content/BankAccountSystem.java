import java.util.Scanner;

class BankAccount {
    String accountHolder;
    final int accountNumber;
    static String bankName = "SRM Bank";
    static int totalAccounts;
    BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }
    static void getTotalAccounts() {
        System.out.println("The total number of accounts are " + totalAccounts);
    }
    void display() {
        System.out.println("Name of account holder: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Bank name: " + bankName);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter details of account holder 1");
        System.out.println("Please enter the name of the account holder");
        String accountHolder = scanner.nextLine();
        System.out.println("Please enter the account number");
        int accountNumber = scanner.nextInt();
        BankAccount bankAccount = new BankAccount(accountHolder, accountNumber);
        scanner.nextLine();
        System.out.println("Please enter details of account holder 2");
        System.out.println("Please enter the name of the account holder");
        accountHolder = scanner.nextLine();
        System.out.println("Please enter the account number");
        accountNumber = scanner.nextInt();
        BankAccount bankAccount1 = new BankAccount(accountHolder, accountNumber);
        bankAccount.display();
        bankAccount1.display();
        BankAccount.getTotalAccounts();
    }
}
