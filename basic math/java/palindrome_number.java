import java.util.Scanner;
public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0,copy=n;
        while(n>0){
            int d = n%10;
            rev = rev*10+d;
            n/=10;
        }
        if(rev==copy) System.out.println("Palindrome Number");
        else System.out.println("Not Palindrome Number");
    }
}
