import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class two_sum {
    public static int[] find(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{map.get(target-arr[i]),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = find(nums,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}