import java.util.*;

public class union_of_two_sorted_arrays {
    public static ArrayList<Integer> merge(int[] arr1, int[] arr2){
        Set<Integer> s = new TreeSet<>();
        for(int i:arr1){
            s.add(i);
        }
        for(int i:arr2){
            s.add(i);
        }
        return new ArrayList<>(s);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1= new int[n1];    
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2= new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        List<Integer> list = merge(arr1, arr2);
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
