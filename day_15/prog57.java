import java.util.Scanner;

//reverse array
public class prog57 {
    public static void reverse(int[] arr)
    {
        int left =0 , right = arr.length-1;
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter"+ n +"elements");
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.println("reversed array:");

        for(int num:arr)
        {
         System.out.println(num + " ");
        }
        sc.close();
}
}
