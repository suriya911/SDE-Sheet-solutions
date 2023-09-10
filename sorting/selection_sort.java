import java.util.*;

public class selection_sort {
    public static void selectionsort(int []arr,int n){
        for(int i=0;i<n-1;i++){
            int a=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[a]){
                    a=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[a];
            arr[a]=t;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionsort(arr,n);
    }
}