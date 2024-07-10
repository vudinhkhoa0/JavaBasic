package MANG_HAI_CHIEU;

/*
    Cho danh sách các tọa độ Oxy, Sắp xếp tọa độ theo chiều tăng của x, nếu cùng hoành độ thì sắp xếp tung độ tăng dần 
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class ViDu {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[][] a = new Integer[n][2];
        for (int i = 0; i < n; ++i) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer[]>(){
            @Override
            public int compare(Integer o1[], Integer o2[]) {
                if (o1[0] != o2[0]) return o1[0] - o2[0];
                else return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n; i ++) { 
            System.out.println("(" + a[i][0] + " " + a[i][1] + ")");
        }
    }
}
