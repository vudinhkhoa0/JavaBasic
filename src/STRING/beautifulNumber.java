package STRING;


import java.util.Scanner;
import java.lang.Math;
public class beautifulNumber {
    // Hai chữ số liền kề chỉ lệch nhau đúng 1 đơn vị
    public static boolean checkBeautifulNumber(String s) {
        for (int i = 0; i < s.length() - 1; ++i) {
            if (Math.abs((int)s.charAt(i) - s.charAt(i + 1)) != 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (checkBeautifulNumber(s)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
