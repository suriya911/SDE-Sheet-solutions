import java.util.*;
public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(" ".repeat(n-i-1));
            for(int j=0;j<=i;j++){
                System.out.print((char)('A'+j));
            }
            for(int j=i-1;j>=0;j--){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }

    }
}
