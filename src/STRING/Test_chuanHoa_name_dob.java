package STRING;

import java.util.Scanner;
public class Test_chuanHoa_name_dob {
    // dob: date of birth
    public static String standardizationName(String[] arrName) {
        String s = "";
        for (String x : arrName) {
            for (int i = 0; i < x.length(); ++i) {
                if (i == 0) s += Character.toUpperCase(x.charAt(0));
                else s += Character.toLowerCase(x.charAt(i));
            }
            s += ' ';
        }
        return s;
    }
    public static String standardizationDOB(String[] arrDOB) { 
        String s = "";
        s = s + 
            String.format("%02d", Integer.parseInt(arrDOB[0])) + '/'
            + String.format("%02d", Integer.parseInt(arrDOB[1])) + '/'
            + String.format("%04d", Integer.parseInt(arrDOB[2]));
        return s;
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String dateOfBirth = sc.nextLine();
        String[] arrName = name.split("\\s+");
        String[] arrDOB = dateOfBirth.split("/");
        name = standardizationName(arrName);
        dateOfBirth = standardizationDOB(arrDOB);
        System.out.println(name);
        System.out.println(dateOfBirth);
    }
}