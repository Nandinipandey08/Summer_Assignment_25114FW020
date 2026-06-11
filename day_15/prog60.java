import java.util.Arrays;
import java.util.Scanner;

public class prog60 {

    public static void moveZeros(int[] arr) {
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) 
            {
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nBefore: " + Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("After:  " + Arrays.toString(arr));

        sc.close();
    }
}
    

