import java.util.*;

public class recursive_insertionsort {
    public static void recursivesort(int []arr,int n,int i){
        if(i==n) return ;
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int t=arr[j];
            arr[j]=arr[j-1];
            arr[j-1] =t;
            j--;
        }
        recursivesort(arr, n, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        recursivesort(arr,n,0);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
