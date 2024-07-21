package Object_Oriented_Programming.Interface.Comparator;

import java.util.Comparator;

public class sortStudent implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien o1, SinhVien o2) { 
        return o1.getName().compareTo(o2.getName());
    }
}
