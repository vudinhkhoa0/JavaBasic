package ARRAY;

import java.util.Scanner;
public class Test_makerArray {
    public static int[] makerArray = new int[1000000];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            makerArray[a[i]] = 1;
        }
        
        for (int i = 0; i < n; ++i) {
            if (makerArray[a[i]] != 0) {
                System.out.print(a[i] + " ");
                makerArray[a[i]] = 0;
            }
        }

    }    
}
