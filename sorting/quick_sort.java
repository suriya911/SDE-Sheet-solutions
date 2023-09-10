import java.util.*;
public class quick_sort {

    public static int partition(int []arr, int l, int r){
        int p=arr[l];
        int i=l,j=r;
        while(i<j){
            while(arr[i]<=p && i<r) i++;
            while(arr[j]>p && j>l) j--;
            if(i<j){
                int t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        int t=arr[l];
        arr[l]= arr[j];
        arr[j]=t;
        return j;
    }
    public static void quicksort(int []arr,int l,int r){
        if(l<r){
            int p = partition(arr,l,r);
            quicksort(arr, l, p-1);
            quicksort(arr, p+1, r);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
