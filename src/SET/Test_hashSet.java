package SET;

import java.util.Scanner; 
import java.util.HashSet;
public class Test_hashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int[] a = {1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 5, 6, 1};
        for (int x : a) set.add(x);
        System.out.println("So phan tu khac nhau la: " + set.size());
        int k1 = 3, k2 = 7;
        if (set.contains(k1)) System.out.println(k1 + " Co ton tai");
        else System.out.println(k1 + " Khong ton tai");
        if (set.contains(k2)) System.out.println(k2 + " Co ton tai");
        else System.out.println(k2 + " Khong ton tai");

    }
}
