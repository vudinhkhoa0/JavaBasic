package RECURSION;

import java.util.Scanner;
public class Test_binPow {
    public static int mod = 1000000007;
    public static long binPow(int a, int b) {
        if (b == 0) return 1;
        long tmp = binPow(a, b / 2);
        if (b % 2 == 0) return ((tmp % mod) * (tmp % mod)) % mod;
        else return ((((tmp % mod) * (tmp % mod)) % mod) * a) % mod;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long result = binPow(a, b);
        System.out.println(result);
    }       
}
