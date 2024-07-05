package SearchALGORITHM;

import java.util.Scanner;
import java.util.ArrayList;
public class Test_linearSearch_arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            arr.add(x);
        }
        int x = sc.nextInt();
        arr.forEach((z) -> {
            if (z == x) {
                System.out.println("Yes");
                return;
            }
        });
        
    }
}
