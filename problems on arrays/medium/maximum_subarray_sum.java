import java.util.Scanner;

public class maximum_subarray_sum {
    public static int maxSum(int[] arr){
        int max=arr[0],sum=0;
        for(int i:arr){
            sum+=i;
            if(sum>max) max=sum;
            if(sum<0) sum=0;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(maxSum(arr));
    }    
}
