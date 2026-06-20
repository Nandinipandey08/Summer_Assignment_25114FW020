import java.util.Scanner;

public class prog90 {

    public static char firstNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isRepeating = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return str.charAt(i);
            }
        }
        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = firstNonRepeating(input);

        if (result == '\0') {
            System.out.println("\nNo non-repeating character found.");
        } else {
            System.out.println("\nFirst non-repeating character -> " + result);
        }

        scanner.close();
    }
}