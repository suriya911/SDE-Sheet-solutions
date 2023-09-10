import java.util.*;

public class print_1_to_n {
    public static void print(int i,int n){
        if(i>n)return;
        System.out.print(i+" ");
        print(i+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
    }
}
