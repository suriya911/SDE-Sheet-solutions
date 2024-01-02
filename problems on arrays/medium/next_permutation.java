import java.util.Scanner;

public class next_permutation {

    public static void rev(int[] a,int l,int r){
        while(l<r){
            a[l]=a[l]+a[r]-(a[r]=a[l]);
            l++;
            r--;
        }
    }

    public static void getnext_permutation(int[] nums){
        int x=-1;
        for(int i=nums.length-2;i>=0;i--){
            if (nums[i]<nums[i+1]){
                x=i;
                break;
            }
        }
        if(x!=-1){
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[x]){
                    nums[x]=nums[x]+nums[i]-(nums[i]=nums[x]);
                    break;
                }
            }
        }
        rev(nums,x+1,nums.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        getnext_permutation(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
