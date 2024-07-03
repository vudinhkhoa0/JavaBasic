package MATH_KNOWLEDGE;

import java.util.Scanner;
import java.lang.Math;
public class Math_tPrime {
    // Kiểm tra số nguyên tố
    public static boolean checkPrime(int a) {
        if (a <= 1) return false;
        for (int i = 2; i <= Math.sqrt(a); ++i) {
            if (a % i == 0) return false;
        }
        return true;
    }
    // Check số nguyên tố bình phương
    public static void tPrime(long n) { 
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (checkPrime(i)) System.out.print(1l * i * i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        tPrime(n);
    }
}
