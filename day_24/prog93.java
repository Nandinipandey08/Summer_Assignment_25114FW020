import java.util.Scanner;
//rotation of string

public class prog93
{
    public static boolean isrotation(String s1 , String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        String doubled = s1 + s2;
        return doubled.contains(s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the 1st string:");
        String s1 = sc.nextLine();

        System.out.println("enter the 2nd string:");
        String s2 = sc.nextLine();

         if (isrotation(s1, s2)) {
             System.out.println("\n✔ \"" + s2 + "\" IS a rotation of \"" + s1 + "\"");
        }
        else
        {
         System.out.println("\n✘ \"" + s2 + "\" is NOT a rotation of \"" + s1 + "\"");

        }
        sc.close();
    }
}