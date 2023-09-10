import java.util.Scanner;
public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=2*n;i++){
            if(i<=n){
                System.out.print("*".repeat(i)+" ".repeat(2*(n-i))+"*".repeat(i));
            }else{
                System.out.print("*".repeat(2*n-i)+" ".repeat(2*(i-n))+"*".repeat(2*n-i));
            }
            System.out.println();
        }
    }
}
