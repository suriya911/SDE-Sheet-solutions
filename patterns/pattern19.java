import java.util.Scanner;
public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<2*n;i++){
            if(i<n){
                System.out.print("*".repeat(n-i)+" ".repeat(2*i)+"*".repeat(n-i));
            }else{
                System.out.print("*".repeat(i-n+1)+" ".repeat(2*(2*n-i-1))+"*".repeat(i-n+1));
            }
            System.out.println();
        }
    }
}
