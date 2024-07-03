package LOOP;
import java.util.Scanner;
public class Loop {
    // (**) For: for ([câu lệnh khởi tạo]; [điều kiện lặp]; [câu lệnh cập nhật])
    // (**) while do: while (condition) {...}
    // (**) do while: {..} while (condition);
    // (**) đặt nhãn
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        for (int i = 1; i <= n; ++i) {
            x = sc.nextInt();
            System.out.print(x + " ");
        }
        int i = 0;
        while (i < n) {
            x = sc.nextInt();
            System.out.print(x + " ");
            ++i;
        }
        i = 0;
        do {
            x = sc.nextInt();
            System.out.print(x + " ");
            ++i;
        } while (i < n);
        System.out.println();
        outer : for (i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(j + 1 + " ");
                if (j == 2) break outer;
            }
        }
    }
}
