import java.util.*;

public class move_zero_to_end{

    public static void move(int[] arr){
        int i=0;
        for(int x:arr){
            if(x!=0){
                arr[i++]=x;
            }
        }
        while(i<arr.length){
            arr[i++]=0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        move(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}