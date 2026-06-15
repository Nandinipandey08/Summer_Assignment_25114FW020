import java.util.Scanner;

//sum of diagonal in matrix

public class prog76{
    public static int sum(int arr[][])
    {
        int r = arr.length;
        int c = arr[0].length;
        int sum=0;

        for(int i=0 ; i<r ; i++)
        {
            for(int j=0 ; j<c ; j++)
            {
                if (i == j) 
                {
                    sum = sum + arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        for(int i=0 ; i<r ; i++)
        {
            for(int j=0 ; j<c ; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = sum(arr);
        System.out.println("Sum of diagonal elements: " + result);

        sc.close();
    }
}