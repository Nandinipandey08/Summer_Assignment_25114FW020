 import java.util.Scanner;

public class prog109 {

    static Scanner sc = new Scanner(System.in);

    // Function to display books
    static void displayBooks(String books[], boolean issued[]) {
        System.out.println("\n----- BOOK LIST -----");
        for (int i = 0; i < books.length; i++) {
            System.out.print((i + 1) + ". " + books[i]);

            if (issued[i])
                System.out.println(" (Issued)");
            else
                System.out.println(" (Available)");
        }
    }

    // Function to issue a book
    static void issueBook(String books[], boolean issued[]) {
        System.out.print("Enter book number to issue: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= books.length) {
            if (!issued[n - 1]) {
                issued[n - 1] = true;
                System.out.println("Book issued successfully.");
            } else {
                System.out.println("Book is already issued.");
            }
        } else {
            System.out.println("Invalid book number!");
        }
    }

    // Function to return a book
    static void returnBook(String books[], boolean issued[]) {
        System.out.print("Enter book number to return: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= books.length) {
            if (issued[n - 1]) {
                issued[n - 1] = false;
                System.out.println("Book returned successfully.");
            } else {
                System.out.println("Book was not issued.");
            }
        } else {
            System.out.println("Invalid book number!");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter number of books: ");
        int size = sc.nextInt();
        sc.nextLine();

        String books[] = new String[size];
        boolean issued[] = new boolean[size];

        // User input for books
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name of book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayBooks(books, issued);
                    break;

                case 2:
                    issueBook(books, issued);
                    break;

                case 3:
                    returnBook(books, issued);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);
    }
}