import java.util.Scanner;

//transpose of matrix

public class prog75{
    public static int[][] transpose(int arr[][])
    {
      int r = arr.length;
      int c = arr[0].length;

      int res[][] = new int[c][r];

      for(int i=0 ; i<r ; i++)
      {
        for(int j=0 ; j<c ; j++)
        {
            res[j][i] = arr[i][j];
        }
      }
      return res;
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
        
        int res[][] = transpose(arr);

        for(int i=0 ; i<c ; i++)
        {
            for(int j=0 ; j<r ; j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}