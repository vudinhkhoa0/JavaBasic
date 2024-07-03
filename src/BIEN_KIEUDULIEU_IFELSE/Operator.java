package BIEN_KIEUDULIEU_IFELSE;
import java.lang.Math;
public class Operator {
    public static void main(String[] args) {
        // (**) Phép chia 2 số nguyên -> chỉ giữ lại phần nguyên; float reult = (float)a / b;
        // (**) Tràn số; int a = 10^6, b = 10^6; long result = (long)a * b;
        /*
         * Gán
         * Cộng, trừ, nhân, chia, chia có dư
         * So sánh
         * Toán tử logic: and(&&), or(||), not(!), xor
         * Toán tử tăng giảm: ++, --, (+=, -=, /=, *= -> <Nhanh hơn gán thông thường>)    
         * Toán tử 3 ngôi: [biểu thức so sanh] ? [Việc cần làm khi biểu thức đúng] : [Sai]; -> Không nên dùng toán tử này
         */
        /* 
            Hàm toán học có sẵn: 
                + import java.lang.Math
        */
        int a = -9;
        a = Math.abs(a); // Lấy trị tuyệt đối
        a = (int)Math.sqrt(a); // Căn bậc hai
        a = (int)Math.pow(a, 3); // Mũ
        System.out.println(a);
        System.out.println(Math.PI);
        System.out.println(Math.floor(Math.PI)); // Làm tròn xuống
        System.out.println(Math.ceil(Math.PI)); // Làm tròn lên
        System.out.println(Math.round(Math.PI)); // Làm tròn theo nguyên tắc
        
    }
}
