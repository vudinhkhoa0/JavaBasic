package MATH_KNOWLEDGE;

import java.util.Scanner;
import java.lang.Math;
public class Math_primeFactorization {
    /*
        Sau khi phân tích một số ra thừa số nguyên tố, số ước bằng tống tất cả (số mũ + 1) (*)Link -> Tprime
        VD: 60 = 2^2*3*5 => Tổng số ước: 3*2*2 = 12 
    */
    public static void primeFactorization(int n) {
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        // (**) Xảy ra với nhưng số khi phân tích có mũ < 2
        if (n > 1) System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactorization(n);
    }
}
