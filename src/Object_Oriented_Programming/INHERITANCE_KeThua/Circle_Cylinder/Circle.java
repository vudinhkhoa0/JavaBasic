package Object_Oriented_Programming.INHERITANCE_KeThua.Circle_Cylinder;

public class Circle {
    private double radius;
    private String color; 
    public Circle(double radius, String color) { 
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() { 
        return this.radius;

    }
    public void setRadius(double radius) { 
        this.radius = radius;
    }
    public String getColor() { 
        return this.color;
    }
    public void setColor(String color) { 
        this.color = color;
    }
    public double getArea() { 
        return 3.14 * this.radius * this.radius;
    }
}
