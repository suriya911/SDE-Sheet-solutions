import java.util.Scanner;
public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long rev=0;
        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }
        if(Math.abs(rev)>Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(rev);
    }
}
