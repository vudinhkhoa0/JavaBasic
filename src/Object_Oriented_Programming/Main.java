package Object_Oriented_Programming;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien("NV01", sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine());
        System.out.println(nv);
    }
}
