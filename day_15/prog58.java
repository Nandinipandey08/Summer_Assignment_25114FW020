import java.util.*;
//rotate left

class Solution {
    
    void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate array left or right by k steps
    public int[] rotateArray(int[] arr, int k, String direction) {
        int n = arr.length;

        if (n == 0 || k == 0) return arr;

        k = k % n;

        if (direction.equals("right")) {
            reverseArray(arr, 0, n - 1);
            reverseArray(arr, 0, k - 1);
            reverseArray(arr, k, n - 1);
        } 
        else if (direction.equals("left")) {
            reverseArray(arr, 0, k - 1);
            reverseArray(arr, k, n - 1);
            reverseArray(arr, 0, n - 1);
        }

        return arr;
    }
}

public class prog58 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // Take array elements input
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Take k value input
        System.out.print("Enter k (steps to rotate): ");
        int k = sc.nextInt();

        // Take direction input
        System.out.print("Enter direction (left/right): ");
        String direction = sc.next();

        // Create instance and call rotateArray
        Solution sol = new Solution();
        int[] result = sol.rotateArray(arr, k, direction);

        // Print result
        System.out.print("Rotated Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
