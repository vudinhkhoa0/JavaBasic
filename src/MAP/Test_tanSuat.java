package MAP;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
public class Test_tanSuat {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            if (map.containsKey(a[i])) { 
                int tanSuat = map.get(a[i]);
                ++tanSuat ;
                map.put(a[i], tanSuat);
            }
            else map.put(a[i], 1);
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Integer, Integer> entry : entrySet) { 
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
