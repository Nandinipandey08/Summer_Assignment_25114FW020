import java.util.Scanner;

// string length without strlen()

public class prog81 {
    public static int findlength(String str)
    {
        int count=0;
        for(char c : str.toCharArray())
        {
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String str = sc.nextLine();
        System.out.println("length"+ findlength(str));

        sc.close();
    }
    
}
