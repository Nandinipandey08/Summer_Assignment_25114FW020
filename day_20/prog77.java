import java.util.Scanner;

//multiply matrices

public class prog77{
    public static int[][] multiply(int arr1[][] , int arr2[][])
    {
      int r1= arr1.length;
      int c1= arr1[0].length;
      int c2 = arr2[0].length;

      int res[][] = new int [r1][c2];

      for(int i=0 ; i<r1 ; i++)
      {
        for(int j=0 ; j<c2 ; j++)
        {
            for(int k=0 ; k<c1 ; k++)
            {
                res[i][j]+= arr1[i][k]*arr2[k][j];
            }
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

        if (c1 != r2) 
        {
         System.out.println("Matrix multiplication not possible (columns of A must equal rows of B).");
         sc.close();
         return;
        }


        int arr1[][] = new int[r1][c1];
        int arr2[][]= new int[r2][c2];

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
        int res[][] = multiply(arr1 , arr2);
        for(int i=0 ; i<r1 ; i++)
        {
            for(int j=0 ; j<c2 ; j++)
            {
             System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }

}