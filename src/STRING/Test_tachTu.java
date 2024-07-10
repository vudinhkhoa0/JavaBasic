package STRING;

import java.util.Scanner; 
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Test_tachTu {
    public static String[] useSplit(String s) { 
        String[] arr = s.split("\\s+");
        return arr;
    }
    public static ArrayList<String> useStringToKenizer(String s) { 
        ArrayList<String> arr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) { 
            arr.add(st.nextToken());
        }
        return arr;
    }
    public static String chuanHoa(String s) { 
        String s1 = s;
        s1 = s1.toLowerCase();
        s = "";
        int dem = -1;
        for (char x : s1.toCharArray()) {
            if (dem == -1) { 
                s = s + (char)(x - 32);
                dem ++;
            }
            else s = s + x;
        }
        return s;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = useSplit(s);
        ArrayList<String> arrList = useStringToKenizer(s);
        for (String x : arr) { 
            x = chuanHoa(x);
            System.out.print(x + " ");
        }
        System.out.println();
        for (String x : arrList) {
            x = chuanHoa(x);
            System.out.print(x + " ");
        }
    }
}
