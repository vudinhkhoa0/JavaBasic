package Object_Oriented_Programming.Interface.Comparator;

public class SinhVien {
    private String name;
    private double gpa;

    public SinhVien(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() { 
        return this.name;
    }

    public String toString() {
        return "Name: " + this.name + "\nGpa: " + this.gpa;
    }
}
