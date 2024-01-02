import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class longest_consecutive_sequence {
    public static int getLongestConsecutiveSequence(int[] arr){
        Set<Integer> s = new HashSet<>();
        int max=0;
        for (int i:arr) s.add(i);

        for(int i:arr) {
            int c=1, j=i;
            while (s.contains(++j)){
                s.remove(j);
                c++;
            }
            j=i;
            while(s.contains(--j)){
                s.remove(j);
                c++;
            }
            max = max > c ? max:c;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = getLongestConsecutiveSequence(arr);
        System.out.println(max);
    }
}
