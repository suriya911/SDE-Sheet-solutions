import java.util.*;

public class max_consecutive_one {

    public static int max_consecutive(int[] arr){
        int r=0,l=0,max=0;
        while(r<arr.length){
            while(r<arr.length && arr[r]==1){
                r++;
            }
            max = max > (r-l)? max : (r-l);
            l=++r; 
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(max_consecutive(arr));
    }
}
