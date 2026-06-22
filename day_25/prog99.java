import java.util.Arrays;
import java.util.Scanner;

public class prog99{

    public static String sortNames(String input) {
        String[] names = input.split(" ");

        Arrays.sort(names); 

        StringBuilder result = new StringBuilder();

        for (String name : names) {
            result.append(name).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter names separated by space:");
        String input = sc.nextLine();

        String sorted = sortNames(input);

        System.out.println("Sorted Names:");
        System.out.println(sorted);

        sc.close();
    }
}