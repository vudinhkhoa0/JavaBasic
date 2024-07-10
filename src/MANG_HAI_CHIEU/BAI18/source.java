package MANG_HAI_CHIEU.BAI18;

import java.util.Scanner;

public class source {
    public static void main(String[] args) { 
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; ++i) { 
            for (int j = 0; j < m; ++j) { 
                a[i][j] = sc.nextInt();
            }
        }
        int dem = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                boolean check = true;
                nhan1: for (int k = 0; k < 8; ++k) {
                    int x = i + dx[k], y = j + dy[k];
                    if (x >= 0 && x < n && y >= 0 && y < m) { 
                        if (a[x][y] >= a[i][j]) { 
                            check = false;
                            break nhan1;
                        }
                    }
                }
                if (check) ++dem;
            }
        }
        System.out.println(dem);
    }
}
