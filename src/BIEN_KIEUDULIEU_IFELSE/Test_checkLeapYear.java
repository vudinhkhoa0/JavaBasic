package BIEN_KIEUDULIEU_IFELSE;

import java.util.Scanner;
public class Test_checkLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year  = sc.nextInt();
        if (year % 400 == 0 || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
    }
    }
} 
