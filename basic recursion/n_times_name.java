import java.util.Scanner;

public class n_times_name {
    public static void print(int n){
        if(n==0)return;
        print(n-1);
        System.out.println("Suriya");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
