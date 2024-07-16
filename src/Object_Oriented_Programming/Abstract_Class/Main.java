package Object_Oriented_Programming.Abstract_Class;

public class Main {
    // Abstract Class: có thể chứa abstract method và được cài đặt chi tiết ở lớp con 
    // Supclass kế thừa Abstract Class -> abstract method phải được đặt cụ thể ở lớp con
    // Lưu ý static, dùng với biến kiểu abstract class
    /*
        - Không thể tạo đối tượng từ lớp trừu tượng thông qua toán tử new, tuy nhiên bạn vẫncó thể tạo constructor cho lớp 
        trừu tượng.
        - Lớp chứa phương thức trừu tượng bắt buộc phải là một lớp trừu tượng, tuy nhiên một lớp trừu tượng có thể không
        chứa phương thức trừu tượng.
        - Lớp cha của một lớp trừu tượng có thể không phải là một lớp trừu tượng, ví dụ lớp Object là cha của lớp 
        GeometicObject
        - Một phương thức trừu tượng chỉ có thể được chứa trong một lớp trừu tượng, nếu một lớp con không cài đặt mọi 
        phương thức trừu tượng ở lớp cha thì nó phải được khai báo là một lớp trừu tượng. Các phương thức trừu tượng 
        không thể khai báo với từ khóa static.
        - Bạn không thể tạo đối tượng từ lớp trừu tượng nhưng có thể sử dụng nó như một kiểu dữ liệu.
    */
    public static boolean equalArea(GeometricObject o1, GeometricObject o2) { 
        return o1.getArea() == o2.getArea();
    }
    public static void display(GeometricObject o) { 
        System.out.println(String.format("%.2f",o.getArea()) + " " + String.format("%.2f",o.getPerimeter()));
    }
    public static void main(String[] args) { 
        GeometricObject ob1 = new Circle("Red", true, 10);
        GeometricObject ob2 = new Rectangle("Green", true, 10, 20);
        System.out.println(equalArea(ob1, ob2));
        display(ob1);
        display(ob2);
    }
}
