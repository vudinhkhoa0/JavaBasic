package RECURSION;

import java.util.Scanner;
public class Test_decimalToHexadecimal {
    public static void Pr(int a) {
        if (a < 10) System.out.print(a);
        else if (a == 10) System.out.print("A");
        else if (a == 11) System.out.print("B");
        else if (a == 12) System.out.print("C");
        else if (a == 13) System.out.print("D");
        else if (a == 14) System.out.print("E");
        else if (a == 15) System.out.print("F");
    }
    public static void decimalToHexadecimal(int a) {
        if (a == 0) return;
        else {
            decimalToHexadecimal(a / 16);
            Pr(a % 16);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        decimalToHexadecimal(a);
    }
}
