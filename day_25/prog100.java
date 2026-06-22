import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class prog100 {

    // Function to sort words by length
    public static String sortByLength(String sentence) {
        String[] words = sentence.split(" ");

        Arrays.sort(words, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        });

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String output = sortByLength(input);

        System.out.println("Sorted by length:");
        System.out.println(output);

        sc.close();
    }
}