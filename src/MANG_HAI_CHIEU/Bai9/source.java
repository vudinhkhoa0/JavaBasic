package MANG_HAI_CHIEU.Bai9;

import java.lang.Math;
import java.util.Scanner;
public class source {
    public static boolean checkPrime(int a) { 
        if (a < 2) return false;
        for (int i = 2; i < Math.sqrt(a); ++i)
            if (a % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) { 
                a[i][j] = sc.nextInt();
            }
        }
        int dem = 0;
        for (int i = 0; i < n; ++i) {
            if (checkPrime(a[i][i])) ++dem;
            if (checkPrime(a[i][n - i - 1])) ++dem;
        }
        if (n % 2 == 1) { 
            if (checkPrime(a[n / 2][n / 2])) --dem;
        }
        System.out.println(dem);
    }
}
