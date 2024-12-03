// Parent class: BankAccount
class BankAccount {
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method Overloading: deposit
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(accountHolderName + " deposited: " + amount);
    }

    public void deposit(double amount, String message) {
        balance = balance + amount;
        System.out.println(accountHolderName + " deposited: " + amount + " (" + message + ")");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(accountHolderName + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println(accountHolderName + "'s balance: " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountHolderName, double balance, double interestRate) {
        super(accountHolderName, balance); // Call parent constructor
        this.interestRate = interestRate;
    }

    // Method Overriding: displayBalance
    @Override
    public void displayBalance() {
        super.displayBalance(); // Call parent method
        System.out.println("Interest rate: " + interestRate + "%");
    }

    // Overriding the withdraw method
    @Override
    public void withdraw(double amount) {
        System.out.println("Processing withdrawal from Savings Account...");
        super.withdraw(amount); // Call the parent class's withdraw method
}

// Main class
public class Project9 {
    public static void main(String[] args) {
        // Create a regular bank account
        BankAccount account1 = new BankAccount("Alice", 1000);
        account1.displayBalance();
        account1.deposit(500);
        account1.withdraw(800);
        account1.displayBalance();

        System.out.println();

        // Create a savings account
        SavingsAccount account2 = new SavingsAccount("Bob", 2000, 5);
        account2.displayBalance(); // Overridden method
        account2.deposit(1000, "bonus deposit"); // Overloaded method
        account2.withdraw(1500); // Overridden method
        account2.displayBalance(); // Overridden method
    }
}}
