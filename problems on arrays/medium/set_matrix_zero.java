import java.util.Scanner;

public class set_matrix_zero {
    public static void setzero(int[][] arr){
        boolean [] row = new boolean[arr.length];
        boolean [] col = new boolean[arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(row[i]==true || col[j]==true){
                    arr[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        setzero(arr);
        System.out.println();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
