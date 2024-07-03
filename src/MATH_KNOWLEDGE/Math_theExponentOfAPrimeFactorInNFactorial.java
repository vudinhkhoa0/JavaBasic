package MATH_KNOWLEDGE;
// Có N! và số nguyên tố p; x là bậc của thừa số nguyên tố p trong N! <=> N! % p^x == 0 (với x là lớn nhất)
import java.util.Scanner;
public class Math_theExponentOfAPrimeFactorInNFactorial {
    /*
        8! = 2 * 3 * 4 * 5 * 6 * 7 * 8
        p = 2
        Tiếp tục phân tích 8!: 
        8! = 2 * 3 * 2 * 2 * 5 * 2 * 3 * 7 * 2 * 2 * 2
        => x = 7;
        => degree
    */
    public static int degree(int n, int p) {
        int sum = 0; 
        for (int i = p; i <= n; i += p) {
            int j = i;
            while (j % p == 0) {
                sum += 1;
                j /= p;
            }
        }
        return sum;
    }
    /*
        8! = 2 * 3 * 4 * 5 * 6 * 7 * 8
            2, 4, 6, 8: Có 1 số 2 => floor(8 / 2) = 4
            4, 8: Vẫn dư 1 số 2 => floor(8 / 4) = 2
            8: Vẫn còn số 2 cuối cùng => floor(8 / 8) = 1
            => x = 4 + 2 + 1 = 7
        => Legend Degree
    */
    public static int legendDre(int n, int p) {
        int sum = 0; 
        for (int i = p; i <= n; i *= p) {
            sum += n / i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(degree(n, p));
        System.out.println(legendDre(n, p));
    }
}
