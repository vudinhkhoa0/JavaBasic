package MATH_KNOWLEDGE;

import java.util.Scanner;
import java.lang.Math;
public class Math_fibonacci {
    public static boolean checkFibonacci(long n) {
        if (n == 0 || n == 1) return true;
        long f1 = 0, f2 = 1;
        for (int i = 3; i <= 93; ++i) {
            long f = f1 + f2;
            if (f == n) return true;
            else if (f > n) return false;
            f1 = f2;
            f2 = f;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n <= 9 * 10^18; 0 -> 92: số fibonacci đầu tiên
        long n = sc.nextLong();
        System.out.println(checkFibonacci(n));
    }
}
