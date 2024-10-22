import java.util.*;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.print("  ".repeat((n-i)+1));
            for(int j=0;j<2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
