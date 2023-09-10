import java.util.*;
public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=-n+1;i<n;i++){
            for(int j=-n+1;j<n;j++){
                if(Math.abs(i)>Math.abs(j)){
                    System.out.print(Math.abs(i)+1+" ");
                }else{
                    System.out.print(Math.abs(j)+1+" ");
                }
            }
            System.out.println();
        }
    }
}
