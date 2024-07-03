package RECURSION;
/*
    Thực hiện được 3 thao tác:
        + Lấy N / 2 nếu N chia hết cho 2
        + Lấy N / 3 nếu N chia hết cho 3
        + Else lấy n - 1
*/
import java.util.Scanner;
import java.lang.Math;
public class Test_demSoThaoTac {
    public static int MAX = 1000000000;
    public static int solve(int a) {
        if (a == 1) return 0;
        int solve1, solve2, solve3; 
        solve1 = solve2 = solve3 = MAX;
        if (a % 2 == 0) solve1 = 1 + solve(a / 2);
        if (a % 3 == 0) solve2 = 1 + solve(a / 3);
        if (a > 1) solve3 = 1 + solve(a - 1);
        return Math.min(solve1, Math.min(solve2, solve3));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
