import java.util.*;
public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a='E';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(a+j)+" ");
            }
            a--;
            System.out.println();
        }
    }
}
