import java.util.*;

public class leaders_in_array {
    public static List<Integer> leader(int[] arr){
        List<Integer> list = new ArrayList<>();
        int max = arr[arr.length-1];
        list.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                list.add(max);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> list = leader(arr);
        Collections.sort(list,Collections.reverseOrder());
        for(int i : list){
            System.out.print(i+" ");
        }
    }    
}
