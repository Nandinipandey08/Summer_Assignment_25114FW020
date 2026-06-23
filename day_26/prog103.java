import java.util.Scanner;

public class prog103 {

        static double balance ;


    
    public static void checkBalance() {
        System.out.println(" Current Balance: ₹" + balance);
    }

    
    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited: ₹" + amount);
        } else {
            System.out.println(" Invalid deposit amount");
        }
    }

    
    public static void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(" Insufficient balance");
        } else if (amount <= 0) {
            System.out.println(" Invalid withdrawal amount");
        } else {
            balance -= amount;
            System.out.println(" Withdrawn: ₹" + amount);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n ATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    withdraw(wd);
                    break;

                case 4:
                    System.out.println(" Exiting ATM. Thank you!");
                    break;

                default:
                    System.out.println(" Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}