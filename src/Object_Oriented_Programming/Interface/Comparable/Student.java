package Object_Oriented_Programming.Interface.Comparable;

public class Student implements Comparable<Student>{
    private String name; 
    private double gpa;

    public Student(String name, double gpa) { 
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() { 
        return this.gpa;
    }

    @Override 
    public int compareTo(Student o) { 
        if (this.gpa < o.getGpa()) return -1;
        else if (this.gpa > o.getGpa()) return 1;
        else return 0;
    }

    public String toString() {
        return "Name: " + this.name + "\nGpa: " + this.gpa + "\n----------";
    }
} 
