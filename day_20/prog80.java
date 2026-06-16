import java.util.Scanner;

//coloumn wise sum

public class prog80
{
    public static int[] coloumnSum(int arr[][] , int r, int c)
    {
        int sum[]= new int [c];

        for(int j=0 ; j<c ; j++)
        {
            int total=0;
        
             for(int i=0 ; i<r ; i++)
            {
                total+= arr[i][j];
            }
            sum[j]=total;

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

        int sum[] = coloumnSum(arr, r, c);

        for (int j = 0; j < c; j++) {
            System.out.println("Sum of coloumn " + j + " = " + sum[j]);
        }

        sc.close();
    }
}

