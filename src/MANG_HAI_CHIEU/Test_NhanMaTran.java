package MANG_HAI_CHIEU;


import java.util.Scanner;
public class Test_NhanMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                a[i][j] = sc.nextInt();
            }
        }
        int q = sc. nextInt();
        int[][] b = new int[m][q];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < q; ++j) {
                b[i][j] = sc.nextInt();
            }
        }
        // Nhân ma trận 
        int[][] result = new int[n][q];
        for(int i = 0; i < n; ++i) { 
            for (int j = 0; j < q; ++j) { 
                result[i][j] = 0;
                for (int k = 0; k < m; ++k) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        // in
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < q; ++j) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
