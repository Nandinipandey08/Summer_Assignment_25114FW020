import java.util.Scanner;

public class prog88 {

    public static String removeSpaces(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeSpaces(input);

        System.out.println("Before -> " + input);
        System.out.println("After  -> " + result);

        scanner.close();
    }
}