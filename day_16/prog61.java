import java.util.Scanner;

//finding missing number

public class prog61 {
    public static int findnumber(int[]arr, int n)
    {
      int total= n*(n+1)/2;
      int sum = 0;
      for(int num: arr)
        {
            sum+=num;
        } 
        return (total - sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter N count:");
        int n= sc.nextInt();

        System.out.println("enter"+ (n-1)+"elements");
        int[]arr= new int[n-1];
        for(int i=0 ; i<n-1 ; i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("missing number"+ findnumber(arr , n));
        
        sc.close();
    }
    
}
