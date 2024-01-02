import java.util.Scanner;

public class sort_0s_1s_2s {
    public static void swap(int[] arr, int i, int j){
        arr[i]=arr[i]+arr[j] - (arr[j]=arr[i]);
    }

    public static void sort(int[] arr){
        int l=0,m=0,h=arr.length-1;
        while(m<=h){
            if(arr[m]==0) swap(arr,l++,m++);
            else if(arr[m]==1) m++;
            else swap(arr,m,h--);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sort(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}