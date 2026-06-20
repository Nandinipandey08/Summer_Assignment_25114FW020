import java.util.Scanner;

public class prog92 {

    public static char maxOccurring(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = 0;
        char result = ' ';

        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = maxOccurring(input);

        System.out.println("\nMaximum occurring character -> '" + result + "'");
        System.out.println("Occurrences                -> " + countOccurrence(input, result));

        scanner.close();
    }

    public static int countOccurrence(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}