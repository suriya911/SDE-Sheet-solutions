import java.util.*;
public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            char t='A';
            for(int j=0;j<=i;j++){
                System.out.print(t++ + " ");
            }
            System.out.println();
        }
    }
}
