package Object_Oriented_Programming.INHERITANCE_KeThua.Person_Student;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Student> arr1 = new ArrayList<>();
        ArrayList<Staff> arr2 = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            sc.nextLine();
            arr1.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextDouble()));
        }
        for (int i = 0; i < n; ++i) { 
            sc.nextLine();
            arr2.add(new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        Collections.sort(arr1, new Comparator<Student>() {
           @Override
            public int compare(Student o1, Student o2) {
                if (o1.getFee() != o2.getFee()) { 
                    if (o1.getFee() > o2.getFee()) return -1;
                    else return 1;
                }
                else return o1.getName().compareTo(o2.getName());
            }});
        Collections.sort(arr2, new Comparator<Staff>(){
            @Override
            public int compare(Staff o1, Staff o2) { 
                if (o1.getPay() != o2.getPay()) { 
                    if (o1.getPay() > o2.getPay()) return -1;
                    else return 1;
                }
                else return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
