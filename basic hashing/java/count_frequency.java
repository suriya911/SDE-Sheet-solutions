import java.util.*;

public class count_frequency {
    public static void frequency(int []arr, int n){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" => "+e.getValue());
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        frequency(arr,n);
    }
}