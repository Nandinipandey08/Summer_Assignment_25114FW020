import java.util.Scanner;


// substract matrices

public class prog74{
    public static int[][] sub(int arr1[][],int arr2[][])
    {
        int r= arr1.length;
        int c= arr1[0].length;
        int res[][]= new int [r][c];

        for(int i=0 ; i<r ; i++)
        {
            for(int j=0 ; j<c ; j++)
            {
                res[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return res;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int r2= sc.nextInt();
        int c2= sc.nextInt();

        if (r1 != r2 || c1 != c2) 
        {
          System.out.println("Matrix dimensions must match for subtraction.");
          sc.close();
          return ;

        }


        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];

        for(int i=0 ; i<r1 ; i++)
        {
            for(int j=0 ; j<c1 ; j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        for(int i=0 ; i<r2 ; i++)
        {
            for(int j=0 ; j<c2 ; j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        int res[][] = sub(arr1 , arr2);
        for(int i=0 ; i<r1 ; i++)
        {
            for(int j=0 ; j<c1 ; j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }

}
