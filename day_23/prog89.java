import java.util.Scanner;

//first repeating cahracter
public class prog89{
    public static char firstrepeating(String str)
    {
        for(int i=0 ; i<str.length() ; i++)
        {
            for(int j=i+1 ; j<str.length() ; j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    return(str.charAt(i));
                }
            }
        }
        return 0;
    }
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    char result = firstrepeating(input);

    if (result == '\0') {
        System.out.println("\nNo repeating character found.");
    } else {
        System.out.println("\nFirst repeating character -> " + result);
    }

    scanner.close();
}

}