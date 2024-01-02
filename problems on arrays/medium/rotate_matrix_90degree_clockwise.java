import java.util.Scanner;

public class rotate_matrix_90degree_clockwise {
    public static void rotate90(int [][]arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                arr[i][j]=arr[i][j]+arr[j][i]-(arr[j][i]=arr[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            int low=0,high=n-1;
            while(low<high){
                arr[i][low]=arr[i][low]+arr[i][high]-(arr[i][high]=arr[i][low]);
                low++;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotate90(arr);
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
