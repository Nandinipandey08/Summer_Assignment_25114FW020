import java.util.Scanner;

public class prog112
 {

    static Scanner sc = new Scanner(System.in);

    // Function to add contacts
    static void addContacts(String names[], String phones[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            names[i] = sc.next();

            System.out.print("Enter Phone Number: ");
            phones[i] = sc.next();
        }
    }

    // Function to display contacts
    static void displayContacts(String names[], String phones[], int n) {
        System.out.println("\n----- CONTACT LIST -----");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + names[i] +
                               " - " + phones[i]);
        }
    }

    // Function to search contact
    static void searchContact(String names[], String phones[], int n) {
        System.out.print("Enter name to search: ");
        String search = sc.next();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Contact Found!");
                System.out.println("Name: " + names[i]);
                System.out.println("Phone: " + phones[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();

        String names[] = new String[n];
        String phones[] = new String[n];

        addContacts(names, phones, n);

        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Contacts");
            System.out.println("2. Search Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayContacts(names, phones, n);
                    break;

                case 2:
                    searchContact(names, phones, n);
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