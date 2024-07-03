package RECURSION;

import java.util.Scanner;
import java.lang.Math;
public class Test_decimalToBinary {
    public static void decimalToBinary(int a) {
        if (a == 0) return;
        decimalToBinary(a / 2);
        System.out.print(a % 2);
    } 
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        decimalToBinary(a);
    }
}
