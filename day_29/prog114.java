import java.util.Scanner;

public class prog114 {

    static Scanner sc = new Scanner(System.in);

    // Function to display array
    static void display(int arr[], int n) {
        System.out.println("Array Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to search an element
    static void search(int arr[], int n) {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }

    // Function to find largest element
    static void largest(int arr[], int n) {
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Largest Element = " + max);
    }

    // Function to calculate sum
    static void sum(int arr[], int n) {
        int s = 0;

        for (int i = 0; i < n; i++) {
            s += arr[i];
        }

        System.out.println("Sum of array elements = " + s);
    }

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n===== ARRAY OPERATIONS MENU =====");
            System.out.println("1. Display Array");
            System.out.println("2. Search Element");
            System.out.println("3. Find Largest Element");
            System.out.println("4. Find Sum of Elements");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    display(arr, n);
                    break;

                case 2:
                    search(arr, n);
                    break;

                case 3:
                    largest(arr, n);
                    break;

                case 4:
                    sum(arr, n);
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