package LOOP;

import java.util.Scanner;
public class Test_tongChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int result = 0;
        while (n != 0)  {
            result += (n % 10);
            n /= 10;
        }
        System.out.println("Tong cac chu so cua " + m + " la: " + result);
    }    
}
