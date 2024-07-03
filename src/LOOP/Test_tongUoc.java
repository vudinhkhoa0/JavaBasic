package LOOP;

import java.util.Scanner;
import java.lang.Math;
public class Test_tongUoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), result = 0;
        
        for (int i = 1; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                result = result + i;
                if (i != n / i) 
                    result = result + (n / i);
            }
        }

        System.out.println("Tong cac uoc cua " + n + " la: " + result);
    }
    
}
