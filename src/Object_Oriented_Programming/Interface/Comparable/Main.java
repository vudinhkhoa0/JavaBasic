package Object_Oriented_Programming.Interface.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) { 
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student("Teo", 3.1));
        arr.add(new Student("Nam", 3.4));
        arr.add(new Student("Ty", 2.7));
        arr.add(new Student("Phuong", 2.1));
        Collections.sort(arr);
        for (Student x : arr) {
            System.out.println(x);
        }
    }

}
