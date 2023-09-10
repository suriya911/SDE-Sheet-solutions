import java.util.*;
public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(u++ +" ");
            }
            System.out.println();
        }
    }
}
