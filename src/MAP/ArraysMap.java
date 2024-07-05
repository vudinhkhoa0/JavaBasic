package MAP;

import java.util.Scanner; 
import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
public class ArraysMap {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; ++i) {
            int tmp = sc.nextInt();
            if (map.containsKey(tmp)) {
                int tanSuat = map.get(tmp);
                ++tanSuat;
                map.put(tmp, tanSuat);
            }
            else {
                map.put(tmp, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            arr.add(entry);
        }
        for (int i = 0; i < arr.size(); ++i) {
            System.out.println(arr.get(i).getKey() + ": " + arr.get(i).getValue());
        }
    }
}
