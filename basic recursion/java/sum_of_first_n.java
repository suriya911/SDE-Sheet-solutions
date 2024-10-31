package java;

import java.util.*;

public class sum_of_first_n {
    public static int sum(int n) {
        if (n <= 1)
            return 1;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
}
