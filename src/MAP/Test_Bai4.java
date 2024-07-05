package MAP;

/*
    Cho A[] N phần tử: 
        + Thao tác 1: Thêm 1 phần tử x vào mảng 
        + Thao tác 2: Xóa 1 phần tử x khỏi mảng, không có không xóa, có nhiều xóa 1
        + Thao tác 3: Truy vấn xem x có xuất hiện hay không
*/
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test_Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        int[] a = new int[N];
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < N; ++i) {
            a[i] = sc.nextInt();
            if (map.containsKey(a[i])) {
                int tanSuat = map.get(a[i]);
                ++tanSuat;
                map.put(a[i], tanSuat);
            }
            else map.put(a[i], 1);
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; ++i ) { 
            int tt = sc.nextInt(), x = sc.nextInt();
            if (tt == 1) { 
                if (map.containsKey(x)) { 
                    int tanSuat = map.get(x);
                    ++tanSuat;
                    map.put(x, tanSuat);
                }
                else { 
                    map.put(x, 1);
                }
            }
            else if (tt == 2) { 
                if (map.containsKey(x)) { 
                    int tanSuat = map.get(x);
                    --tanSuat;
                    if (tanSuat == 0) {
                        map.remove(x);
                    }
                    else {
                        map.put(x, tanSuat);
                    }
                }
            }
            else { 
                if (map.containsKey(x)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
