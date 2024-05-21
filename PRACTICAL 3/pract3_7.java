import java.util.Scanner;

class Account {
    int accountId;
    String name;
    double balance;

    // Function to assign values to account details
    void assign(int id, String n, double b) {
        accountId = id;
        name = n;
        balance = b;
    }

    // Function to display account details
    void display() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Balance: $" + balance);
    }

    // Function to search for an account by account number
    void search(int accNum, Account[] accounts) {
        boolean found = false;
        for (Account acc : accounts) {
            if (acc.accountId == accNum) {
                System.out.println("Account found:");
                acc.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found for Account ID: " + accNum);
        }
    }
}

public class pract3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array of Account objects
        Account[] accounts = new Account[5];

        // Initializing accounts
        accounts[0] = new Account();
        accounts[0].assign(1001, "John", 5000);
        accounts[1] = new Account();
        accounts[1].assign(1002, "Alice", 7000);
        accounts[2] = new Account();
        accounts[2].assign(1003, "Bob", 3000);
        accounts[3] = new Account();
        accounts[3].assign(1004, "Emily", 9000);
        accounts[4] = new Account();
        accounts[4].assign(1005, "David", 6000);

        // Displaying details of all accounts
        System.out.println("Details of all accounts:");
        for (Account acc : accounts) {
            acc.display();
            System.out.println();
        }

        // Searching for an account by account number
        System.out.print("Enter account number to search: ");
        int searchAccNum = scanner.nextInt();
        System.out.println("Searching for account with Account ID: " + searchAccNum);
        accounts[0].search(searchAccNum, accounts);

        scanner.close();
    }
}
