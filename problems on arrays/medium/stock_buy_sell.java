import java.util.Scanner;

public class stock_buy_sell {
    public static int maxProfit(int[] arr){
        int min=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++){
            profit = profit > arr[i]-min ? profit : arr[i]-min;
            min = min < arr[i] ? min :arr[i];
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maxProfit(arr));
    }
}
