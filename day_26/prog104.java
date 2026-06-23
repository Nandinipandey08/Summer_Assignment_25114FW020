import java.util.Scanner;

public class prog104 {

    static int score = 0;

    // Function to ask question
    public static void askQuestion(String question, Scanner sc) {

        System.out.println("\n" + question);

        System.out.print("Enter Option A: ");
        String a = sc.nextLine();

        System.out.print("Enter Option B: ");
        String b = sc.nextLine();

        System.out.print("Enter Option C: ");
        String c = sc.nextLine();

        System.out.print("Enter Option D: ");
        String d = sc.nextLine();

        System.out.print("Enter correct option (A/B/C/D): ");
        char correct = sc.nextLine().toUpperCase().charAt(0);

        System.out.println("\n--- QUIZ TIME ---");
        System.out.println("A. " + a);
        System.out.println("B. " + b);
        System.out.println("C. " + c);
        System.out.println("D. " + d);

        System.out.print("Your answer: ");
        char ans = sc.nextLine().toUpperCase().charAt(0);

        if (ans == correct) {
            System.out.println(" Correct!");
            score++;
        } else {
            System.out.println(" Wrong!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of questions: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("\n======================");
            System.out.println("Question " + i);

            System.out.print("Enter question: ");
            String q = sc.nextLine();

            askQuestion(q, sc);
        }

        System.out.println("\n🏁 Quiz Finished!");
        System.out.println("Final Score: " + score + "/" + n);

        sc.close();
    }
}