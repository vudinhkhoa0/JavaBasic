package ARRAY;

import java.util.Arrays;
import java.util.Comparator;
public class Array {
    // (**) Syntax: Data_type[] array_name = new Data_type [Number_of_element];
    // (**) Các giá trị mặc định đều = 0
    // (**) Cấp phát đến < 10^9
    // (**) Vùng nhớ cấp phát lưu mảng là heap
    // (**) Cơ chế garbage collection tự động dọn dẹp bộ nhớ
    // (**) java.lang.ArrayIndexOutOfBoundsException: ... => Truy cập index ngoài bộ nhớ của mảng 
    // (**) public static void doubling(int a[], int n), Vì a lưu tham chiếu nên sẽ cho phép thao tác trực tiếp trên các 
    // ô nhớ (bằng id)
    /* (**) Hàm sort trong java: Arrays.sort(a), Độ phức tạp: O(n.logn): 10^7
        VD: sort(a, 2, 5); Sort tăng dần từ 2 => 4
            + fromIndex: "inclusive" -> bao gồm vào
            + toIndex: "exclusive" -> không bao gồm vào 
            + Sắp xếp giảm dần (Note: Không dùng được kiểu nguyên thủy: int,...; dùng được kiểu đối tượng: Integer...)
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) return -1;
                else return 1;
            } 
                    Import: java.util.Comparator;
                    syntax: Arrays.sort(a, new Comparator<Integer>() {
                        @Override 
                        public int compare(Integer o1, Integer o2) {
                        }
                    });
    */
    public static void main(String[] args) {
        Integer[] a = {1, 4, 2, 5, 7, 6, 3};
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1 trước o2: -1;
                // o1 sau o2: 1;
                if (o1 > o2) return -1;
                else return 1;
            }
        });
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
