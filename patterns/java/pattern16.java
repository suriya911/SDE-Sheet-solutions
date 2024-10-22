import java.util.*;
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char t='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(t + " ");
            }
            t++;
            System.out.println();
        }
    }
}
