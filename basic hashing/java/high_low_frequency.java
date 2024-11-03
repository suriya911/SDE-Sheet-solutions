import java.util.*;

public class high_low_frequency {
    public static void frequency(int []arr, int n){
        Map<Integer,Integer> map = new HashMap<>();
        int min=0,max=0,low=n,high=0;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()>high){
                high = e.getValue();
                max=e.getKey();
            }
            if(e.getValue()<low){
                low=e.getValue();
                min=e.getKey();
            }
        }
        System.out.println("Lowest frequency: "+min+" => "+low);
        System.out.println("Highest frequency: "+max+" => "+high);
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