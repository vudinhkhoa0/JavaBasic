package BIEN_KIEUDULIEU_IFELSE;
import java.util.Scanner;
public class Test_xepLoaiHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        a = b = c = d = sc.nextDouble();
        double result = (a + b + c * 2 + d * 3) / 7;
        if (result >= 8) {
            System.out.println("GIOI");
        }
        else if (result >= 6.5) {
            System.out.println("KHA");
        }
        else if (result >= 5) {
            System.out.println("TRUNG BINH");
        }
        else {
            System.out.println("YEU");
        }
    }
}
