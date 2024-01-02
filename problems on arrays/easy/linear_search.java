import java.util.*;

public class linear_search {
    public static int search(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.print(search(arr, t));
    }
}
