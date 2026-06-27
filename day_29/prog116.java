import java.util.Scanner;

public class prog116 {

    static Scanner sc = new Scanner(System.in);

    // Function to display inventory
    static void display(String product[], int quantity[], int n) {

        System.out.println("\n----- INVENTORY DETAILS -----");

        for (int i = 0; i < n; i++) {
            System.out.println("Product: " + product[i]);
            System.out.println("Quantity: " + quantity[i]);
            System.out.println();
        }
    }

    // Function to search product
    static void search(String product[], int quantity[], int n) {

        System.out.print("Enter product name to search: ");
        String key = sc.next();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (product[i].equalsIgnoreCase(key)) {
                System.out.println("Product Found!");
                System.out.println("Product: " + product[i]);
                System.out.println("Quantity: " + quantity[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        String product[] = new String[n];
        int quantity[] = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter product name: ");
            product[i] = sc.next();

            System.out.print("Enter quantity: ");
            quantity[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Inventory");
            System.out.println("2. Search Product");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    display(product, quantity, n);
                    break;

                case 2:
                    search(product, quantity, n);
                    break;

                case 3:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}