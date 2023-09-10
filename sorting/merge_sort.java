import java.util.*;
public class merge_sort {

    public static void merge(int []arr,int l,int m,int r){
        ArrayList<Integer> a = new ArrayList<>();
        int left = l;
        int right = m+1;
        while(left<=m && right<=r){
            if(arr[left]<=arr[right]){
                a.add(arr[left]);
                left++;
            }
            else{
                a.add(arr[right]);
                right++;
            }
        }
        while(left<=m) a.add(arr[left++]);

        while(right<=r) a.add(arr[right++]);

        for(int i=l;i<=r;i++){
            arr[i]=a.get(i-l);
        }
    }

    public static void mergesort(int []arr, int l,int r){
        if (l>=r) return ;
        int m = (l+r)/2;
        mergesort(arr,l,m);
        mergesort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
