import java.util.*;
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        System.out.print(msg);
    }
}

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in your account.");
        }
        balance -= amount;
        System.out.println("Withdrawn: Rs " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class pract6_3 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(1000.00);

        try {
            account.withdraw(400.00);
            account.withdraw(300.00);
            account.withdraw(500.00);
        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("Remaining balance: Rs " + account.getBalance());
    }
}
