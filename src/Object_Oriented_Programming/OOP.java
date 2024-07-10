package Object_Oriented_Programming;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OOP {
    // (**) Khái niệm quan trọng Class-Lớp && Object-Đối Tượng
    /*
        Class: mô tả chung
        Object: đối tượng trong class
        Attribute(Thuộc tính)
        Method(Phương thức) 
        Cấu trúc class: 
        class class_name { 
            access_specifier1(Quyền truy cập - public, protected, private): 
                member1, member2, ...
            access_specifier2: 
                member1, member2, ...
        }
        Constructor() - Hàm tạo
        this pointer - Con trỏ this
        getter();
        setter();
        static keyword: chung cho cả class, dù đối tượng khác nhau nhưng thuộc tính static phải bằng(giống) nhau. 
        Tính chất: 
            Encapsulation(Đóng gói): 
                Thuộc tính để private
                Phương thức: public
    */  
    // public static void main(String[] args) { 
    //     Scanner sc = new Scanner(System.in);
    //     // Thử Constructor:
    //     System.out.println("Thu nghiem constructor: ");
    //     SinhVien person1 = new SinhVien();
    //     SinhVien person2 = new SinhVien("Nguyen Van A", "01/01/2004", "So_duong ten_duong - Phuong(Huyen) - Quan(Tp) - TP HCM", 9);
    //     SinhVien person3 = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        
    //     System.out.println();
    //     System.out.println("So luong sinh vien hien tai(static): " + person1.getSoLuong());
    //     System.out.println("Person 1: ");
    //     person1.printInformation();

    //     System.out.println();
    //     System.out.println("Person 2: ");
    //     person2.printInformation();

    //     System.out.println();
    //     System.out.println("Person 3: ");
    //     person3.printInformation();

    //     // Test phương thức toString
    //     System.out.println();
    //     System.out.println("Thu nghiem phuong thuc toString: ");
    //     System.out.println(person1);
    //     System.out.println(person2);
    //     System.out.println(person3);
    // }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            sc.nextLine();
            SinhVien s = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            arr.add(s); 
        }
        // Sắp xếp gpa giảm dần
        Collections.sort(arr, new Comparator<SinhVien>(){
            @Override 
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getGpa() > o2.getGpa()) return -1;
                else return 1;
            }
        });

        System.out.println();
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}
