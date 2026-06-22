import java.util.Scanner;

// to find common character
public class prog98{
    public static void findcommon(String str)
    {
        int[] freq = new int[256];

        for(int i = 0 ; i< str.length() ; i++)
        {
            freq[str.charAt(i)]++;
        }

        System.out.println("common character:");

        for(int i = 0 ; i< 256 ; i++)
        {
            if(freq[i] > 1)
            {
                System.out.println((char)i +"appears" + freq[i] + "times");
            }
        }

     }
    
     public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter the string");
            String input = sc.nextLine();

            findcommon(input);
            sc.close();
        }
    }
}