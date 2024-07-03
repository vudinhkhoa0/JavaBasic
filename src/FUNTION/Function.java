package FUNTION;

import java.util.Scanner;
public class Function {
    // (**) Syntax: public static returnType functionName (parameter1, parameter2,...) {// function body}
    // VD: public static void xinChao() {   System.out.println("Hello World!")  }
    // (**) CallFuntion -> Như C++
    /* New Knowledge
     * Nạp chồng hàm (function overloading)
     * Cùng tên, khác tham số, kiểu trả về => tùy theo kiểu dữ liệu của tham số, hàm phù hợp sẽ được gọi
    */
    // cbrt(n): căn bậc 3 của n
    public static int findMax(int a, int b) {
        if (a > b) return a;
        return b;
    }
    public static double findMax(double a, double b) {
        if (a > b) return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        double c, d;
        c = sc.nextDouble();
        d = sc.nextDouble();
        System.out.println("So lon nhat giua " + a + " va " + b + " la: " + findMax(a, b));
        System.out.println("So lon nhat giua " + c + " va " + d + " la: " + findMax(c, d));
    }
}
