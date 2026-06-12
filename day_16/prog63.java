import java.util.Scanner;
import java.util.Arrays;
//find pair sum

public class prog63 {
    public static boolean findpair(int[]arr, int n, int target)
    {
        Arrays.sort(arr);
        int left=0,right=n-1;

        while(left < right)
        {
            int sum = arr[left] + arr[right];
            if(sum ==  target)
            {
                System.out.println("pair"+ arr[left]+ ","+arr[right]);
                return true;
            }
            else if( sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return false;
    }
        public static void main(String[] args)
         {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        System.out.println("Pairs with sum " + target + ":");

        if (!findpair(arr, n, target))
            System.out.println("No pairs found.");

        sc.close();
    }
}


    
    

