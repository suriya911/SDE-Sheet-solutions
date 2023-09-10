import java.util.*;
public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<2*n;i++){
            if(i<n){
                System.out.print("  ".repeat(n-i-1));
                for(int j=0;j<2*i+1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                System.out.print("  ".repeat(i-n));
                for(int j=0;j<2*(2*n-i)-1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
