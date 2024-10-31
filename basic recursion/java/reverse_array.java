package java;

import java.util.Scanner;

public class reverse_array {

    public static void reverse(int[] arr, int i, int j) {
        if (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            reverse(arr, i + 1, j - 1);
        } else
            return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
