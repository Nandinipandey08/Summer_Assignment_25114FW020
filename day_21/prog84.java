import java.util.Scanner;
//convert lowercase to upper case
public class prog84 {
    public static String toUpper(String str)
    {
        char[] ch= str.toCharArray();
        for(int i=0 ; i< ch.length ; i++ )
            {
              if(ch[i] >='a' && ch[i]<='z')
              {
                ch[i] = (char) (ch[i] - 32);
              }
            }
            return toUpper(str);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String input = sc.nextLine();
        
        String result = toUpper(input);
        System.out.println("uppercase string" + result);
        sc.close();


    }
    
}
