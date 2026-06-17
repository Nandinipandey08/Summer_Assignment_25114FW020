
// count vowels and consonants

import java.util.Scanner;

public class prog83 {
    public static void countVC(String str)
    {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();

        for(char c: str.toCharArray())
        {
            if(c >= 'a' && c <= 'z')
            {
                if(c == 'a'|| c == 'e' || c=='i' || c=='o' || c=='u')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
        }
        System.out.println("vowels:" + vowels + ", consonants:" + consonants);
    }
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        countVC(input);

        sc.close();
    }
}



    
    

