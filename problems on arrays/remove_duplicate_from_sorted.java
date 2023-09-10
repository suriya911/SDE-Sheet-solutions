import java.util.*;

public class remove_duplicate_from_sorted {
    public static int remodedupicate(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = remodedupicate(arr);
        for (int i = 0; i < t; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
