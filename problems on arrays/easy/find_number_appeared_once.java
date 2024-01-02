import java.util.*;

public class find_number_appeared_once {
    public static int find(int[] arr){
        int res=0,i=0;
        while(i<arr.length){
            res^=arr[i++];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(find(arr));
    }
}
