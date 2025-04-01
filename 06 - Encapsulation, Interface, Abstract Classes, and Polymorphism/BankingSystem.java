import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }

    public void withdraw(double amount) { if (amount <= balance) balance -= amount; }

    public void displayDetails() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amount) { System.out.println("Loan applied for amount: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() >= 10000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }
    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan(double amount) { System.out.println("Loan applied for amount: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() >= 25000; }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        BankAccount acc1 = new SavingsAccount("SA001", "Alice", 15000);
        BankAccount acc2 = new CurrentAccount("CA001", "Bob", 30000);
        accounts.add(acc1);
        accounts.add(acc2);
        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());
            Loanable loanAcc = (Loanable) acc;
            loanAcc.applyForLoan(10000);
            System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
            System.out.println();
        }
    }
}
