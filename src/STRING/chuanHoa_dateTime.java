package STRING;
// java.util.IllegalFormatConversionException -> kiểu không hợp lệ
import java.util.Scanner;
public class chuanHoa_dateTime {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("/");
        s = "";
        s = s + String.format("%02d", Integer.parseInt(arr[0])) 
            + '/' + String.format("%02d", Integer.parseInt(arr[1])) 
            + '/' + String.format("%04d", Integer.parseInt(arr[2]));
        System.out.println(s);
    }
}
