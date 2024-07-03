package ARRAYLIST;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class ArrayList_newKnowledge {
    // Array list: 
    /*
        Syntax: 
            + List <dataType> arr = new ArrayList<>();
            + ArrayList<dataType> arr = new ArrayList<>();
            + Chỉ dùng được Object(Lớp wrapper)
            + import java.util.ArrayList;
        Các hàm: 
            + name_ArrayList.add(value); // thêm value vào arrayList
            + name_ArrayList.get(index); // Lấy dữ liệu tại vị trí index
            + name_ArrayList.clear(); // Xóa toàn bộ phần tử trong arrayList
            + name_ArrayList.isEmpty(); // Kiểm tra arrayList rỗng -> trả về true false
            + name_ArrayList.contains(value); // Check xem value có ở trong arrayList hay không -> trả về true false
            + name_ArrayList.set(index, value); // Thay giá trị tại vị trí index bằng value
            + name_ArrayList.remove(index); // Xóa phần tử tại vị trí index
            + name_ArrayList.remove(Object); // Xóa phần tử thông qua giá trị, nếu có nhiểu chỉ xóa thằng đầu tiên
            + name_ArrayList.indexOf(value); // Trả về vị trí đầu tiên nếu phần tử đó xuất hiện trong mảng, không -> -1
            + name_ArrayList.toArray(); // Trả về mảng chứa các object tương tự như trong array list
            + name_ArrayList.forEach((x) ->); // Cung cấp 1 hàm áp dụng nào đó với lần lượt các phần tử trong array list
            + name_ArrayList.sort(new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            + Collections.sort([array list], new Comparator<Integer>(){
                @Override 
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int tmp = sc.nextInt();
            arr.add(tmp);
        }
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); ++i) 
            System.out.print(arr.get(i) + " ");
        System.out.println();

        System.out.println(arr.contains(5));
        
        arr.set(2, 100);
        for (int i = 0; i < arr.size(); ++i) 
            System.out.print(arr.get(i) + " ");

        arr.remove((Object)1);
        System.out.println();
        for (int i = 0; i < arr.size(); ++i) 
            System.out.print(arr.get(i) + " ");
        
        System.out.println();
        Object[] b = arr.toArray();
        for (int i = 0; i < arr.size(); ++i) System.out.print(b[i] + " ");

        System.out.println();
        arr.forEach((z) -> z += 10);
        arr.forEach((z) -> System.out.print(z + " "));

        System.out.println();
        arr.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer x : arr) System.out.print(x + " ");

        System.out.println();
        Collections.sort(arr, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        arr.forEach((z) -> System.out.print(z + " "));

    }
}
