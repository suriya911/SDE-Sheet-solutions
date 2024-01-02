import java.util.*;

public class left_rotate_by_k {

    public static void rev(int[] arr, int l, int r) {
        while (l < r) {
            arr[l] = arr[l] + arr[r] - (arr[r] = arr[l]);
            l++;
            r--;
        }
    }

    public static void rotate(int[] arr, int k) {
        k %= arr.length;
        //right - FULL ROTATE FIRST 
        rev(arr, 0, arr.length - 1);
        rev(arr, 0, k - 1);
        rev(arr, k, arr.length - 1);
        //left - FULL ROTATE LAST
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
