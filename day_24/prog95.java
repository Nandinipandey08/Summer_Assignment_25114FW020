import java.util.Scanner;

public class prog95 {

    // Function to find longest word
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String result = findLongestWord(input);

        System.out.println("Longest word: " + result);

        sc.close();
    }
}