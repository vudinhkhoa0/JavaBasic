package ARRAY;

import java.util.Scanner;
public class Test_prefixSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] prefixSumArray = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            if (i == 0) {
                prefixSumArray[i] = a[i];
            }
            else {
                prefixSumArray[i] = prefixSumArray[i - 1] + a[i];
            }
        }
        for (int i = 0; i < n; ++i) System.out.print(prefixSumArray[i] + " ");
    }
}
