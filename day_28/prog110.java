import java.util.Scanner;

public class prog110 {

    static Scanner sc = new Scanner(System.in);
    static double balance;

    // Function to create account
    static void createAccount() {
        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();
        System.out.println("Account created successfully!");
    }

    // Function to deposit money
    static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    // Function to withdraw money
    static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Function to check balance
    static void checkBalance() {
        System.out.println("Current Balance = ₹" + balance);
    }

    public static void main(String[] args) {

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        createAccount();

        int choice;

        do {
            System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;

                case 2:
                    withdraw();
                    break;

                case 3:
                    System.out.println("Account Holder: " + name);
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You for Banking with Us!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}