package STRING;

import java.util.Scanner;
public class toLowerCase {
    public static String convertLowerCase(String s) {
        return s.toLowerCase();
    }
    public static String useCharacterClass(String s) {
        String res = "";
        for (int i = 0; i < s.length(); ++i) {
            res += Character.toLowerCase(s.charAt(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = convertLowerCase(s);
        String s2 = useCharacterClass(s);
        System.out.print(s1 + " " + s2);
    }
}
