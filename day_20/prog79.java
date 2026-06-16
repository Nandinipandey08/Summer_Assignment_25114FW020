import java.util.Scanner;

//row wise sum

public class prog79
{
    public static int[] rowsum(int arr[][] , int r, int c)
    {
        int sum[]= new int [r];

        for(int i=0 ; i<r ; i++)
        {
            int total=0;
        
             for(int j=0 ; j<c ; j++)
            {
                total+= arr[i][j];
            }
            sum[i]=total;

        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum[] = rowsum(arr, r, c);

        for (int i = 0; i < r; i++) {
            System.out.println("Sum of row " + i + " = " + sum[i]);
        }

        sc.close();
    }
}
