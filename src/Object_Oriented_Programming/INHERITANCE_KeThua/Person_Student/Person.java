package Object_Oriented_Programming.INHERITANCE_KeThua.Person_Student;

public class Person {
    private String name, address;
    public Person(String name, String address) { 
        this.name = name;
        this.address = address;
    }
    public String getName() { 
        return this.name;
    }
    public void setName(String name) { 
        this.name = name;
    }
    public String getAddress() { 
        return this.address;
    }
    public void setAddress(String address) { 
        this.address = address;
    }
    public String toString() { 
        return "Full name : " + this.name + "\nAddress : " + this.address + "\n";
    }
}
