import java.util.Scanner;

// Interface for core banking services
interface BankingServices {
    void checkBalance();
    void updatePhoneNumber();
    void makeTransaction();
    void requestATMCard();
    void netBankingServices();
}

public class Project12 implements BankingServices {
    private double balance = 1000.0; // Initial balance
    private String phoneNumber = "9560-661-100"; // Default phone number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Project12 bank = new Project12();

            System.out.println("\n--- Welcome to Amulya Bank ---");
            System.out.println("1. Check bank balance");
            System.out.println("2. Update Phone Number");
            System.out.println("3. Make a transaction");
            System.out.println("4. Do you want ATM Card");
            System.out.println("5. Net Banking services");
            System.out.println("6. Exit");

            System.out.print("Enter your choice (1-6): ");
            int choice;

            try {
                choice = sc.nextInt();
                switch (choice) {
                    case 1 -> bank.checkBalance();
                    case 2 -> bank.updatePhoneNumber();
                    case 3 -> bank.makeTransaction();
                    case 4 -> bank.requestATMCard();
                    case 5 -> bank.netBankingServices();
                    case 6 -> {
                        System.out.println("Thank you for using Amulya Bank. Have a great day!");
                        sc.close();
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter a number between 1-6.");
                sc.nextLine(); // Clear input buffer
            }
        }
    

    // Implementing interface methods
    public void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    public void updatePhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your new phone number: ");
        phoneNumber = sc.nextLine();
        System.out.println("Phone number updated successfully to: " + phoneNumber);
    }

    public void makeTransaction() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the amount to withdraw: $");
            double amount = sc.nextDouble();
            if (amount <= 0 || amount > balance) {
                throw new ArithmeticException("Invalid transaction amount!");
            }
            balance -= amount;
            System.out.println("Transaction successful! Remaining balance: $" + balance);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void requestATMCard() {
        System.out.println("Your ATM card request has been submitted successfully.");
        System.out.println("You will receive it within 7-10 business days.");
    }

    public void netBankingServices() {
        System.out.println("Net banking is enabled for your account.");
        System.out.println("Login details have been sent to your registered phone number: " + phoneNumber);
    }
}
