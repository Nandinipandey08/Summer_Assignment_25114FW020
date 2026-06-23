import java.util.Scanner;

public class prog102 {

    // Function to check eligibility
    public static void checkEligibility(String name, int age) {

        System.out.println("\n VOTING STATUS");

        if (age >= 18) {
            System.out.println(name + ", you are eligible to vote ");
        } else {
            System.out.println(name + ", you are NOT eligible to vote ");
            System.out.println("You need " + (18 - age) + " more years.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        checkEligibility(name, age);

        sc.close();
    }
}