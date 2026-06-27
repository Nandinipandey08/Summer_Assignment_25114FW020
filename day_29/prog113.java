import java.util.Scanner;

public class prog113{

    static Scanner sc = new Scanner(System.in);

    static void add() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
    }

    static void subtract() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Difference = " + (a - b));
    }

    static void multiply() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product = " + (a * b));
    }

    static void divide() {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b != 0)
            System.out.println("Quotient = " + (a / b));
        else
            System.out.println("Division by zero not possible.");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: add(); break;
                case 2: subtract(); break;
                case 3: multiply(); break;
                case 4: divide(); break;
                case 5: System.out.println("Thank You!"); break;
                default: System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}