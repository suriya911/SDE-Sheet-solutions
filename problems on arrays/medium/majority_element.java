import java.util.Scanner;

public class majority_element {
    public static int majority(int[] arr){
        int a=0,c=0;
        for(int i:arr){
            if(c==0) a=i;
            if(i==a) c++;
            else c--;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(majority(arr));
    }
}
