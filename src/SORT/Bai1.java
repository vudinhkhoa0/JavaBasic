package SORT;

/*
    Hai yêu cầu: 
        + Sắp xếp số lượng chữ số chẵn xuất hiện trong số tăng dần, nếu bằng nhỏ hơn in trước
        + ------------------------lẻ------------------------------, nếu bằng thằng nào có trước in trước
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Bai1 {
    public static int countEven(int n) {
        int tmp = 0; 
        while (n != 0) {
            if (n % 2 == 0) ++tmp;
            n /= 10;
        }
        return tmp;
    }
    public static int countOdd(int n) {
        int tmp = 0;
        while (n != 0) {
            if (n % 2 != 0) ++tmp;
            n /= 10;
        }
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(a, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (countEven(o1) != countEven(o2)) return countEven(o1) - countEven(o2);
                else return o1 - o2;
            }
        });
        for (int i = 0; i < n; ++i) System.out.print(a[i] + " ");
        System.out.println();
        // Arrays.sort đã tự đảm bảo thằng nào xuất hiện trước in ra trước. 
        Arrays.sort(b, new Comparator<Integer>(){
            @Override 
            public int compare(Integer o1, Integer o2) {
                return countOdd(o1) - countOdd(o2);
            }
        });
        for (int i = 0; i < n; ++i) System.out.print(b[i] + " ");
        System.out.println();
    }
}
