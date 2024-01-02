import java.util.*;

public class second_smallest_largest {
    public static int second_largest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Invalid input");
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_max = max;
                max = arr[i];
            } else if (arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        return second_max;
    }

    public static int second_smallest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Invalid input");
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                second_min = min;
                min = arr[i];
            } else if (arr[i] < second_min && arr[i] != min) {
                second_min = arr[i];
            }
        }
        return second_min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second largest element : " + second_largest(arr));
        System.out.println("Second smallest element : " + second_smallest(arr));
    }
}
