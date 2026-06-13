import java.util.Scanner;
import java.util.Arrays;

public class prog65 {
    public static int[] merge(int[] arr1, int n, int[]arr2, int m)
    {
        int[] merged = new int [n+m];

        for(int i=0 ; i<n ; i++)
        {
            merged[i] = arr1[i];
        }
        for(int i=0 ; i<m ; i++)
        {
            merged[n+i] = arr2[i];
        }
        Arrays.sort(merged);
        return merged;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.print("Enter elements of array 1: ");
        for (int i = 0; i < n; i++) 
        {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of array 2: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter elements of array 2: ");

        for (int i = 0; i < m; i++)
            {
                 arr2[i] = sc.nextInt();
            }

        int[] res=merge(arr1 , n ,arr2 ,m);

        System.out.print("Merged array: ");
        for (int num : res) System.out.print(num + " ");

        sc.close();
    }

    
}

