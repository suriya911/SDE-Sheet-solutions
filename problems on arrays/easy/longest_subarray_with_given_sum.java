import java.util.*;

public class longest_subarray_with_given_sum {
    public static int longest(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                max = max > i + 1 ? max : i + 1;
            }
            int res = sum - k;
            if (map.containsKey(res)) {
                int l = i - map.get(res);
                max = max > l ? max : l;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.print(longest(arr, sum));
    }
}
