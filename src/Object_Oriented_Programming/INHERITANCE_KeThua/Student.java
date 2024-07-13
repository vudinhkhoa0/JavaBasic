package Object_Oriented_Programming.INHERITANCE_KeThua;

public class Student extends Person {
    private String lop;
    private double gpa;
    public Student(String lop, double gpa, String name, String birth) { 
        super(name, birth);
        this.lop = lop;
        this.gpa = gpa;
    }
}
