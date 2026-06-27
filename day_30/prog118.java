import java.util.ArrayList;
import java.util.Scanner;


class Book {
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;

    
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false; 
    }


    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return isBorrowed; }
    
    public void setBorrowed(boolean status) { this.isBorrowed = status; }

    @Override
    public String toString() {
        String status = isBorrowed ? "Borrowed" : "Available";
        return String.format("ID: %-6s | Title: %-25s | Author: %-20s | Status: %s", id, title, author, status);
    }
}


public class prog118 {
    
    private static ArrayList<Book> library = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        initializeDummyData();

        while (true) {
            displayMenu();
            int choice = getUserChoice();

            
            switch (choice) {
                case 1:
                    addBookFunction();
                    break;
                case 2:
                    displayBooksFunction();
                    break;
                case 3:
                    borrowBookFunction();
                    break;
                case 4:
                    returnBookFunction();
                    break;
                case 5:
                    System.out.println("\n Thank you for using Mini Library System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select an option between 1 and 5.");
            }
        }
    }

    
    private static void displayMenu() {
        System.out.println("\n=================================");
        System.out.println("      MINI LIBRARY SYSTEM        ");
        System.out.println("=================================");
        System.out.println("1. Add a New Book");
        System.out.println("2. Display All Books");
        System.out.println("3. Borrow a Book");
        System.out.println("4. Return a Book");
        System.out.println("5. Exit System");
        System.out.print("Enter your choice: ");
    }

    
    private static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

    
    private static void addBookFunction() {
        System.out.println("\n--- Add New Book Details ---");
        System.out.print("Enter Unique Book ID: ");
        String id = scanner.nextLine().trim();

        
        if (findBookById(id) != null) {
            System.out.println(" Error: A book with ID " + id + " already exists.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine().trim();

        if (id.isEmpty() || title.isEmpty() || author.isEmpty()) {
            System.out.println(" Error: Fields cannot be blank.");
            return;
        }

        library.add(new Book(id, title, author));
        System.out.println(" Book added successfully!");
    }


    private static void displayBooksFunction() {
        System.out.println("\n--- Library Inventory List ---");
        if (library.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }
        for (Book book : library) {
            System.out.println(book);
        }
    }

    
    private static void borrowBookFunction() {
        System.out.println("\n--- Borrow Book Transaction ---");
        System.out.print("Enter the Book ID you want to borrow: ");
        String id = scanner.nextLine().trim();

        Book book = findBookById(id);

        if (book == null) {
            System.out.println(" Error: Book ID not found in inventory.");
        } else if (book.isBorrowed()) {
            System.out.println(" Sorry, this book is already checked out/borrowed.");
        } else {
            book.setBorrowed(true);
            System.out.println(" Success! You have successfully borrowed: " + book.getTitle());
        }
    }

    
    private static void returnBookFunction() {
        System.out.println("\n--- Return Book Transaction ---");
        System.out.print("Enter the Book ID you are returning: ");
        String id = scanner.nextLine().trim();

        Book book = findBookById(id);

        if (book == null) {
            System.out.println(" Error: Invalid Book ID. It does not belong to this library.");
        } else if (!book.isBorrowed()) {
            System.out.println(" Warning: This book is already marked as available in the system.");
        } else {
            book.setBorrowed(false);
            System.out.println(" Success! Thank you for returning: " + book.getTitle());
        }
    }

    
    private static Book findBookById(String id) {
        for (Book book : library) {
            if (book.getId().equalsIgnoreCase(id)) {
                return book;
            }
        }
        return null; 
    }

    
    private static void initializeDummyData() {
        library.add(new Book("B101", "Effective Java", "Joshua Bloch"));
        library.add(new Book("B102", "Clean Code", "Robert C. Martin"));
        library.add(new Book("B103", "Head First Java", "Kathy Sierra"));
    }
}
