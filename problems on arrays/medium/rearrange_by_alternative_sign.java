import java.util.Scanner;

public class rearrange_by_alternative_sign {
    static int[] rearrange(int[] arr){
        int []res = new int[arr.length];
        int n=1,p=0;
        for(int i:arr){
            if(i>0){
                res[p]=i;
                p+=2;
            }
            else{
                res[n]=i;
                n+=2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        arr = rearrange(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
