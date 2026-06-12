import java.util.Scanner;
import java.util.Arrays;

public class prog62 
{
    public static int maxfreq(int[] arr, int n)
  {
     if(n==0)
     {
        return -1;
     }
     Arrays.sort(arr);

     int maxcount=1, res=arr[0];
     int currcount=1;
     for(int i=1 ; i<n ; i++)
    {
        if(arr[i]==arr[i-1])
        {
            currcount++;
        }
        else
        {
            currcount=1;
        }
    
        if(currcount > maxcount)
        {
            maxcount = currcount;
            res = arr[i];
        }
    }
    return res;

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enetr the number of elemnts:");
    int n = sc.nextInt();
    int[]arr= new int[n];

    System.out.println("enter"+n+"elements=");
    for(int i=0 ; i<n ; i++)
    {
        arr[i]=sc.nextInt();
    }
    int res=maxfreq(arr , n);
    System.out.println("elements with maximum frequency"+ res);


    sc.close();
  }
    
}
