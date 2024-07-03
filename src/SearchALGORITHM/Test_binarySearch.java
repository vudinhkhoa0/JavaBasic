package SearchALGORITHM;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
    + Arrays
        - Arrays.binarySearch(nameArray, value); 
            -> trả về vị trí bất kỳ của value trong mảng
            -> không tồn tại: - (insertion point) - 1; Vd: 1 2 3 7 8 9, value = 5; -> Trả về: -3 - 1 = -4
    + Collections
    + Áp dụng:  Khi tìm kiếm nhiều lần, vì nếu 1 lần chỉ cần dùng linearSearch(Tốn O(n)). 
                Nếu dùng binarySearch, tốn O(nlogn)_sort + O(log2(n))_binarySearch

*/
public class Test_binarySearch {
    public static String binarySearch(ArrayList<Integer> arr, int x, int l, int r) {
        int mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr.get(mid) == x) return "Yes";
            else if (arr.get(mid) > x) r = mid - 1;
            else l = mid + 1;
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.print("Mang sau khi sap xep(tang dan) la: ");
        arr.forEach((z) -> System.out.print(z + " "));
        System.out.println();
        System.out.print("Nhap so can tim: ");
        int x = sc.nextInt();
        System.out.println(binarySearch(arr, x, 0, arr.size() - 1));
    }    
}
