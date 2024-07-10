package MAP.Intersection;

import java.util.Scanner;
import java.util.HashMap;

public class source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[M];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            a[i] = sc.nextInt();
            map.put(a[i], 1);
        }        
        for (int i = 0; i < M; ++i) { 
            b[i] = sc.nextInt();
            if (map.containsKey(b[i])) map.put(b[i], 2);
        }
        for (int i = 0; i < N; ++i) 
            if (map.containsKey(a[i]) && map.get(a[i]) == 2) {
                System.out.print(a[i] + " ");
                map.remove(a[i]);
            }
    }
}
