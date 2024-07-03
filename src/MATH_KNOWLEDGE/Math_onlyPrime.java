package MATH_KNOWLEDGE;

/*
    Số thuần nguyên tố: 
        + Là số nguyên tố
        + Tất cả chữ số của nó đều là số nguyên tố 
        + Tổng các chữ số cũng là số nguyên tố
*/
import java.util.Scanner;
import java.lang.Math;
public class Math_onlyPrime {
    public static boolean checkPrime(long a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); ++i) {
            if (a % i == 0) return false;
        }
        return true;
    }
    public static boolean checkOnlyPrime(long a) {
        long sum = 0;
        while (a != 0) {
            long x = a % 10;
            if (x != 2 && x != 3 && x !=5  && x != 7) return false;
            sum += x;
            a /= 10;
        }
        return checkPrime(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int dem = 0;
        for (long i = a; i <= b; ++i) {
            if (checkOnlyPrime(i) && checkPrime(i)) {
                System.out.print(i + " ");
                ++dem;
            }
        }
        System.out.println();
        System.out.println(dem);
    }
    
}
