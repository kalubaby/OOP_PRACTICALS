 import java.util.*;

 class BankAccount {
    protected double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void openAccount(double initialDeposit) {
        if (initialDeposit > 0) {
            balance = initialDeposit;
            System.out.println("Account opened successfully with initial deposit: " + initialDeposit);
        } else {
            System.out.println("Initial deposit must be greater than 0.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " made. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " made. New balance: " + balance);
        } else {
            System.out.println("Withdrawal amount exceeds balance or is invalid.");
        }
    }

    public double checkBalance() {
        System.out.println("Current balance: " + balance);
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double initialDeposit, double interestRate) {
        openAccount(initialDeposit);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest calculated and added. New balance: " + balance);
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenure; // in months
    private double interestRate;

    public FixedDepositAccount(double initialDeposit, int tenure, double interestRate) {
        openAccount(initialDeposit);
        this.tenure = tenure;
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate * tenure / 12 / 100;
        balance += interest;
        System.out.println("Interest calculated and added. New balance: " + balance);
    }
}

public class pract4_2 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5); // Initial deposit of 1000 and interest rate of 5%
        savingsAccount.checkBalance();
        savingsAccount.deposit(500);
        savingsAccount.calculateInterest();
        savingsAccount.withdraw(200);
        savingsAccount.checkBalance();

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(2000, 12, 8); // Initial deposit of 2000, tenure of 12 months, and interest rate of 8%
        fixedDepositAccount.checkBalance();
        fixedDepositAccount.calculateInterest();
        fixedDepositAccount.withdraw(500);
        fixedDepositAccount.checkBalance();
    }
}
