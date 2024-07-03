package BIEN_KIEUDULIEU_IFELSE;
import java.util.Scanner;
public class Variable {
    // ví dụ: int 4 byte = 32 bit =>  2^-31 -> 2^31 - 1 
    /* (**) 1 kiểu dữ liệu có c bit, lưu được: (-2)^(k-1) --> 2^(k-1) - 1 -- Số nguyên -- */
    /* (**) Khác nhau giữa float && double: Độ chính xác của double gấp đôi float */
    /* (**) Biến(Variable): [Kiểu dữ liệu][Tên biến]; (Phân biệt hoa thường)*/
    // psvm + tab -> public static void main(String[] args)
    /* (**) NAME CONVENTION: banKinh, dienTich,... */
    /* (**) Khai báo long lớn quá sẽ bị xem như int và báo lỗi, thêm L vào cuối số
        VD: long 123456789L; float ...F; double ...D 
    */ 
    /* (**) Cú pháp in: System.out.println(""); sout + tab
            Số thực: System.out.printf("%.xf\n", [tên biến]);
            Số nguyên(cách 2): System.out.printf("%.d", [tên biến]);
    */
    /* (**) Input:
            - Scanner sc = new Scanner(System.in);
            - import java.util.Scanner;
            - char a = sc.nextLine().charAt(0);
            - int a = nextInt();
     */
    // (***) Nhập không đúng kiểu dữ liệu: Error -> InputMismatchException
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("So vua nhap tu ban phim la: " + a);
    }
}
