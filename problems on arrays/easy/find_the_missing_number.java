import java.util.*;

public class find_the_missing_number {
    public static int missing(int[] arr){
        int n = arr.length;
        int sum = ((n+1)*n)/2;
        for(int i:arr){
            sum-=i;
        }
        return sum;
    }
    // public static int xor(int[] arr){
    //     int a=0,b=0;
    //     for(int i=0;i<arr.length;i++){
    //         a^=arr[i];
    //         b^=(i+1);
    //     }
    //     return a^b;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(missing(arr));
    }
}
