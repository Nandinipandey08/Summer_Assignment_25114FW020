import java.util.Scanner;

//movie ticket booking system
public class prog120{

    static void displayBookings(String[] names, int[] seats, int n) {
        System.out.println("\n------ Booking Details ------");
        for (int i = 0; i < n; i++) {
            System.out.println("Customer Name : " + names[i]);
            System.out.println("Seats Booked  : " + seats[i]);
            System.out.println("-----------------------------");
        }
    }

    static int totalSeats(int[] seats, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += seats[i];
        }
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Customers: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] seats = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nCustomer " + (i + 1));

            System.out.print("Enter Customer Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Number of Seats: ");
            seats[i] = sc.nextInt();
            sc.nextLine();
        }

        displayBookings(names, seats, n);

        System.out.println("Total Seats Booked = " + totalSeats(seats, n));

        sc.close();
    }
}