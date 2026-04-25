import java.util.Scanner;

class BankAccount {
    protected String accountHolder;
    protected double balance;

    BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Interest Method (will be overridden)
    public void calculateInterest() {
        System.out.println("No Interest Calculation in Base Class");
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate = 5.0; // 5%

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double interestRate = 2.0; // 2% (optional)

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added (Current A/C): " + interest);
    }
}
public class Bank {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("Rahul", 10000);
        CurrentAccount ca = new CurrentAccount("Amit", 20000);

        System.out.println("---- Savings Account ----");
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.calculateInterest();
        sa.showBalance();

        System.out.println("\n---- Current Account ----");
        ca.deposit(5000);
        ca.withdraw(3000);
        ca.calculateInterest();
        ca.showBalance();
    }
}