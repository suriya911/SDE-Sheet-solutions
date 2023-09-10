import java.util.Scanner;
public class is_palindrome {
    public static boolean isPalindrome(String s,int i) {
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return isPalindrome(s,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(isPalindrome(s,0));
    }

}
