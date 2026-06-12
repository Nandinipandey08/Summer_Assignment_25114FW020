import java.util.Scanner;
import java.util.Arrays;;
//remove duplicate

public class prog64 {
    public static int removedup(int[]arr , int n)
    {
        if(n==0)
        {
            return 0;
        }
        Arrays.sort(arr);

        int j=0;

        for(int i=1 ; i<n ; i++)
        {
           if(arr[i]!=arr[j])
           {
            j++;
            arr[i] = arr[j];
           }
        }
        return j-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int newLen = removedup(arr, n);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLen; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\nUnique count: " + newLen);
        sc.close();

    }
    
}
