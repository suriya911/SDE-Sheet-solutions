package java;

import java.util.Scanner;

public class n_times {
    public static void print(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        print(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
