package Object_Oriented_Programming.INHERITANCE_KeThua.Circle_Cylinder;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Cylinder> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) { 
            String color = sc.next();
            double radius = sc.nextDouble();
            double height = sc.nextDouble();
            arr.add(new Cylinder(radius, color, height));
        }
        Collections.sort(arr, new Comparator<Cylinder>() {
           @Override
           public int compare(Cylinder o1, Cylinder o2) { 
                if (o1.getVolume() != o2.getVolume()) { 
                    if (o1.getVolume() > o2.getVolume()) return -1;
                    else return 1;
                }
                else {
                    return o1.getColor().compareTo(o2.getColor());
                }
           } 
        });
        for (int i = 0; i < n; ++i) {
            System.out.print(arr.get(i));
        }
    }
}
