package BIEN_KIEUDULIEU_IFELSE;

import java.util.Scanner;
public class Condition {
    // (**) Cấu trúc: if (condition) {...} else {...}
    // (**) Cấu trúc: if (condition) {...} else if (condition) {...} ... else {...}
    // (**) +=32 -> in thường; -=32 in hoa;
    /*
        switch case:
        switch(value) {
            case 1: // code
                break; 
            case 2: // code
                break;
            ...
            case n: // code
                break;
            default : // code   
        }
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1: 
                System.out.println("Mot");
                break;
            case 2: 
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            default:
                System.out.println("Khong thuoc [1, 3]");
                break; 
        }
    }
}
