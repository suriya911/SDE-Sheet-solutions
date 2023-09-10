import java.util.*;
public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            char t='A';
            for(int j=0;j<i;j++){
                System.out.print(t++ + " ");
            }
            System.out.println();
        }
    }
}
