package Object_Oriented_Programming.Polymorphism;

public class Main {
    public static void main(String[] args) { 
        Person p1 = new Student();
        Person p2 = new Staff();
        Person p3 = new Lecturer();
        p1.display();
        p2.display();
        p3.display();
        Person p4 = new Student();
        // instanceof
        if (p4 instanceof Student) { 
            System.out.println("Ok!");
            Student s1 = (Student) p4;
        }
        else { 
            System.out.println("Error!");
        }
        if (p4 instanceof Staff) {
            System.out.println("Ok!");
            Staff s2 = (Staff) p4;
        }
        else { 
            System.out.println("Error!");
        }
    }
}
