import java.util.*;
public class amstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = String.valueOf(n).length();
        int temp = n, sum = 0;
        while(n>0){
            int d=n%10;
            sum+=Math.pow(d,len);
            n/=10;
        }
        if(sum==temp)
            System.out.println("Amstrong");
        else
            System.out.println("Not Amstrong");
    }
}
