import java.util.Scanner;
//to remove duplicate characters

public class prog96{

    public static String removeDuplicates(String str) {
        
        boolean[] seen = new boolean[256]; 
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String output = removeDuplicates(input);

        System.out.println("After removing duplicates: " + output);

        sc.close();
    }
}