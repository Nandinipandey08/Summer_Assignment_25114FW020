import java.util.Scanner;
//character frequency
public class prog87{
    public static int[] countfreq(String input)
    {
        int[] freq = new int[256];
        for(char ch: input.toCharArray())
        {
            freq[ch]++;
        }
        return freq;
    }
    public static void displayfrequency(int[] freq,String input)
    {
        System.out.println("\nCharacter Frequencies:");
        System.out.println("----------------------");

        for(int i=0 ; i<256 ; i++)
        {
            if(freq[i] > 0)
            {
               System.out.println("'" + (char) i + "' -> " + freq[i]);

            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] result = countfreq(input);
        displayfrequency(result, input);

        scanner.close();
    }
}
