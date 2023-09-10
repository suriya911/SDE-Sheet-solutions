import java.util.*;

public class print_n_to_1 {
    public static void print(int n){
        if(n<1)return;
        System.out.print(n+" ");
        print(--n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
