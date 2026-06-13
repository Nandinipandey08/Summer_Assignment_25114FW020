import java.util.Scanner;
//union of arrays

public class prog66{

    static void union(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            result[k++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (arr2[i] == result[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[k++] = arr2[i];
            }
        }

        System.out.print("Union: ");
        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        union(arr1, arr2);

        sc.close();
    }
}
    

