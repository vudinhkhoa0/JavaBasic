package Object_Oriented_Programming.Interface.Comparator;

import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> arr = new ArrayList<>();
        arr.add(new SinhVien("Teo", 3.1));
        arr.add(new SinhVien("Nam", 3.4));
        arr.add(new SinhVien("Ty", 2.7));
        arr.add(new SinhVien("Phuong", 2.1));
        Collections.sort(arr, new sortStudent());
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
