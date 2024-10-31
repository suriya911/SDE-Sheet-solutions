import java.util.Scanner;
public class all_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i*i<=n ; i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i)
                    System.out.print(n/i+" ");
            }
        }
    }
}
