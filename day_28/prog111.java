import java.util.Scanner;

public class prog111 {

    static Scanner sc = new Scanner(System.in);
    static int totalSeats, availableSeats;

    // Function to book ticket
    static void bookTicket() {
        System.out.print("Enter number of tickets to book: ");
        int tickets = sc.nextInt();

        if (tickets <= availableSeats) {
            availableSeats -= tickets;
            System.out.println(tickets + " ticket(s) booked successfully.");
        } else {
            System.out.println("Sorry! Only " + availableSeats + " seats are available.");
        }
    }

    // Function to cancel ticket
    static void cancelTicket() {
        System.out.print("Enter number of tickets to cancel: ");
        int tickets = sc.nextInt();

        if (availableSeats + tickets <= totalSeats) {
            availableSeats += tickets;
            System.out.println(tickets + " ticket(s) cancelled successfully.");
        } else {
            System.out.println("Invalid cancellation!");
        }
    }

    // Function to display available seats
    static void displaySeats() {
        System.out.println("Total Seats      : " + totalSeats);
        System.out.println("Available Seats  : " + availableSeats);
        System.out.println("Booked Seats     : " + (totalSeats - availableSeats));
    }

    public static void main(String[] args) {

        System.out.print("Enter total number of seats: ");
        totalSeats = sc.nextInt();
        availableSeats = totalSeats;

        int choice;

        do {
            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Seat Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bookTicket();
                    break;

                case 2:
                    cancelTicket();
                    break;

                case 3:
                    displaySeats();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}