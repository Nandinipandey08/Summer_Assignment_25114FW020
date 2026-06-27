import java.util.Scanner;

public class prog115 {

    static Scanner sc = new Scanner(System.in);

    // Function to find length
    static void length(String str) {
        System.out.println("Length = " + str.length());
    }

    // Function to convert to uppercase
    static void upperCase(String str) {
        System.out.println("Uppercase String: " + str.toUpperCase());
    }

    // Function to convert to lowercase
    static void lowerCase(String str) {
        System.out.println("Lowercase String: " + str.toLowerCase());
    }

    // Function to reverse string
    static void reverse(String str) {
        System.out.print("Reversed String: ");

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== STRING OPERATIONS MENU =====");
            System.out.println("1. Find Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    length(str);
                    break;

                case 2:
                    upperCase(str);
                    break;

                case 3:
                    lowerCase(str);
                    break;

                case 4:
                    reverse(str);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}